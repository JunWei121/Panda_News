//获取项目url路径
function getRootPath() {
    // 1、获取当前全路径，如： http://localhost:8080/springmvc/page/frame/test.html
    var curWwwPath = window.location.href;
    // 获取当前相对路径： /springmvc/page/frame/test.html
    var pathName = window.location.pathname;    // 获取主机地址,如： http://localhost:8080
    var local = curWwwPath.substring(0, curWwwPath.indexOf(pathName));
    // 获取带"/"的项目名，如：/springmvc
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    var rootPath = local + projectName;
    return rootPath;
}

//<div id="isLosin"><a href="loginindex.html" class="text-muted">登录/注册</a></div>

var isLogin = {
    init: function () {
        $.post(getRootPath() + "/user/isLogin.action", function (data) {
            if (data != null && data != "") {
                var url = data.hPath;
                if (data.hPath == null || data.hPath == "") {
                    url = "userCenter/images/img3.png";
                }
                $("#isLogin").html("<img alt=\"头像\"  src=\"" + url + "\" style=\"height: 26px; width: 26px;border-radius: 50%; display: inline;\">" +
                    "&nbsp;<a href=\"userCenter/user-Center.html\" class=\"text-muted\">" + data.uname +
                    "</a>&emsp;<a href=\"#\" onclick='toExit();' class=\"text-muted\">退出</a>"
                );

                toExit = function () {
                    $.post(getRootPath() + "/user/exit.action", function (data) {
                        if (data == "OK") {
                            alert("退出成功");
                            func();

                            function func() {
                                window.location.reload();
                            }
                        } else {
                            alert("没必要退出哦!");
                        }
                    })
                }
            } else {
                $("#isLogin").html("<a href=\"loginindex.html\" class=\"text-muted\">登录/注册</a>")
            }
        })
    }
};

isLogin.init();