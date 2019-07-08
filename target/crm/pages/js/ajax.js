$().ready(function() {
		var value = getParam();
		var urivalue = encodeURI(value);
		var youDate = new Date().toLocaleDateString();
//		var theDate = youDate.toUTCString();
		$("#nid").attr("value", urivalue);
		$("#cdate").attr("value", youDate);
		//		$("#cuser").attr("value",theuser);
		var sourceurl = "http://127.0.0.1:8080/cms/do/news/getNews?newsId=" + urivalue;
		$.ajax({
			type: "get",
			url: sourceurl,
			async: true,
			dataType: "json",
			success: function(data) {
				$("#atitle").append("<title>" + data[0].newsTitle + "</title>");
				$("#title").append("<h1>" + data[0].newsTitle + "</h1>");
				$("#content").append("<p>" + data[0].newsContent + "</p>");
				$("#newsImg").attr("src", data[0].newsStyle);
				$("#type").append("<li>" + data[0].newsType + "</li>");
				$("#type1").append("<a>" + data[0].newsType + "</a>");
				$("#date").append("<a>" + data[0].newsIssDate + "</a>");
			}
		});
		var gcode = encodeURI("国际新闻");
		var gurl = "http://127.0.0.1:8080/cms/do/news/findNewsTypeByNews?newsType=" + gcode;
		$.ajax({
			type: "get",
			url: gurl,
			async: true,
			dataType: "json",
			success: function(data) {
				var gj1 = "single-post.html?newsId=" + data[0].newsId;
				$("#g1").append("<a href='" + gj1 + "'>" + data[0].newsTitle + "</a>");
				var gj2 = "single-post.html?newsId=" + data[1].newsId;
				$("#g2").append("<a href='" + gj2 + "'>" + data[1].newsTitle + "</a>");
				var gj3 = "single-post.html?newsId=" + data[2].newsId;
				$("#g3").append("<a href='" + gj3 + "'>" + data[2].newsTitle + "</a>");
				var gj4 = "single-post.html?newsId=" + data[3].newsId;
				$("#g4").append("<a href='" + gj4 + "'>" + data[3].newsTitle + "</a>");
				$("#gdate1").append("<a>" + data[0].newsIssDate + "</a>");
				$("#gdate2").append("<a>" + data[1].newsIssDate + "</a>");
				$("#gdate3").append("<a>" + data[2].newsIssDate + "</a>");
				$("#gdate4").append("<a>" + data[3].newsIssDate + "</a>");
			}
		});
		var rcode = encodeURI("热点新闻");
		var rurl = "http://127.0.0.1:8080/cms/do/news/findNewsTypeByNews?newsType=" + rcode;
		$.ajax({
			type: "get",
			url: rurl,
			async: true,
			dataType: "json",
			success: function(data) {
				var hoting1 = "single-post.html?newsId=" + data[0].newsId;
				$("#hot1").append("<a href='" + hoting1 + "'>" + data[0].newsTitle + "</a>");
				var hoting2 = "single-post.html?newsId=" + data[1].newsId;
				$("#hot2").append("<a href='" + hoting2 + "'>" + data[1].newsTitle + "</a>");
				var hoting3 = "single-post.html?newsId=" + data[2].newsId;
				$("#hot3").append("<a href='" + hoting3 + "'>" + data[2].newsTitle + "</a>");
				var hoting4 = "single-post.html?newsId=" + data[3].newsId;
				$("#hot4").append("<a href='" + hoting4 + "'>" + data[3].newsTitle + "</a>");
				$("#hotdate1").append("<a>" + data[0].newsIssDate + "</a>");
				$("#hotdate2").append("<a>" + data[1].newsIssDate + "</a>");
				$("#hotdate3").append("<a>" + data[2].newsIssDate + "</a>");
				$("#hotdate4").append("<a>" + data[3].newsIssDate + "</a>");
			}
		});
		var ncode = encodeURI("实时新闻");
		var nurl = "http://127.0.0.1:8080/cms/do/news/findNewsTypeByNews?newsType=" + ncode;
		$.ajax({
			type: "get",
			url: nurl,
			async: true,
			dataType: "json",
			success: function(data) {
				var nowing1 = "single-post.html?newsId=" + data[0].newsId;
				$("#new1").append("<a href='" + nowing1 + "'>" + data[0].newsTitle + "</a>");
				var nowing2 = "single-post.html?newsId=" + data[1].newsId;
				$("#new2").append("<a href='" + nowing2 + "'>" + data[1].newsTitle + "</a>");
				var nowing3 = "single-post.html?newsId=" + data[2].newsId;
				$("#new3").append("<a href='" + nowing3 + "'>" + data[2].newsTitle + "</a>");
				var nowing4 = "single-post.html?newsId=" + data[3].newsId;
				$("#new4").append("<a href='" + nowing4 + "'>" + data[3].newsTitle + "</a>");
				$("#newdate1").append("<a>" + data[0].newsIssDate + "</a>");
				$("#newdate2").append("<a>" + data[1].newsIssDate + "</a>");
				$("#newdate3").append("<a>" + data[2].newsIssDate + "</a>");
				$("#newdate4").append("<a>" + data[3].newsIssDate + "</a>");
			}
		});
		$.ajax({
			type: "get",
			url: "http://127.0.0.1:8080/cms/do/newsType/newsTypeList",
			async: true,
			dataType: "json",
			success: function(data) {
				$.each(data, function(i) {
					$("#mainnewstype").append("<li class='nav__dropdown'><a href='#'>" + data[i].newsTypeName + "</a></li>");
				});
			}
		});
		$.ajax({
			type: "post",
			url: "http://127.0.0.1:8080/cms/do/newsComment/newsCommentList ",
			async: true,
			dataType: "json",
			success: function(data) {
				$.each(data, function(i) {
					if(data[i].newsId == urivalue) {
                        var comment_decode = decodeURI(data[i].commentContent);
                        var date_decode1 = data[i].commentDate;
//                      alert(date_decode1);
                        var date_decode2 = date_decode1.replace("%2F","/");
                        var date_decode3 = date_decode2.replace("%2F","/");
						$("#comment_list").append('<li class="comment ">' +
							'<div class = "comment - body " >' +
							'<div class = "comment - text " >' +
							'<h6 class = "comment - author " >' + data[i].username + "</h6>" +
							'<div class = "comment - metadata " >' +
							'<p class = "comment - date " >' + date_decode3 + " </p>" +
							"</div>" +
//							"<p >" + data[i].commentContent + "</p>" +
							"<p >" + comment_decode + "</p>" +
							"</div>" +
							"</div>" +
							"</li>" + "<hr>");
					}
				});
			}

		});
		$("#submit1").click(function() {
				var formParam = $("#form_comment").serialize();
				var encodeform = encodeURI(formParam);
				$.ajax({
					type: 'post',
					url: 'http://127.0.0.1:8080/cms/do/newsComment/newsCommentSave?' + encodeform,
					cache: false,
					success: function() {
						alert("评论成功！");
						window.location.reload();
					}
				});
			}

		)

	}

)

function getParam() {
	var url = window.location.search;
	url = decodeURI(url);
	var result;
	console.log(url.indexOf("?"));
	if(url.indexOf("?") != -1) {
		result = url.substr(url.indexOf("=") + 1)
	}
	return result;
}