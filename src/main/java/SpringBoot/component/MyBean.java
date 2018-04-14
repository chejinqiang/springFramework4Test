package SpringBoot.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by chejinqiang on 2018/4/8.
 * 在SpringBoot启动的时候运行指定的代码和功能。可以实现AppliationRunner或CommandLineRunner接口。这两个接口都提供了
 * 一个run方法，会在SpringApplication的方法完成前调用。CommandLineRunner提供了对应用程序参数的访问，并提供给run方法。
 */
@Component
public class MyBean implements CommandLineRunner{

    private static final Logger logger = LoggerFactory.getLogger(MyBean.class);

    @Value("${name}")
    private String name;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("在SpringBoot启动的时候运行指定的代码和功能:{}",name);
    }
}
