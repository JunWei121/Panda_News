import com.demo.entity.User;
import com.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 * // 告诉junit spring配置文件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml", "classpath:springmvc-config.xml",
        "classpath:mybatis-config.xml"})
@WebAppConfiguration("src/main/resources")
@Transactional
@Rollback(true)
public class TestBase {

    @Autowired
    private UserService userService;

    @Test
    public void testSer(){
        User user = userService.findUser("m0001", "123");
        System.out.println(user);
    }
}
