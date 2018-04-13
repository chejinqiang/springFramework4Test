package SpringBoot.controller;

import SpringBoot.component.MyBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chejinqiang on 2018/4/7.
 * @RestController，Spring4之后新加入的注解，原来返回json需要@Controller和@ResponseBody，即@RestController是@Controller和@ResponseBody的结合。
 * @EnableAutoConfiguration是第二个类级别的配置属性，尝试猜测和配置可能需要的属性。spring通常建议我们将main方法所在的类放到一个root包下，
 * @EnableAutoConfiguration通常放到main所在的类上面，这样就可以逐层的往下搜索加注解的类。
 *
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @Autowired
    private MyBean2 myBean2;

    @RequestMapping("/")
    String home() {
        int servers = myBean2.getServers().size();
        return "Hello World!" + servers;
    }

}
