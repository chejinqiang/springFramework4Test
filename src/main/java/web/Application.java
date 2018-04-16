package web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import web.controller.DemoController;
import web.service.FactoryBeanPojo;

/**
 * Created by chejinqiang on 2018/4/14.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-first.xml");
        //测试factoryBean接口
        Object school = context.getBean("factoryBeanPojo");
        FactoryBeanPojo factoryBeanPojo = (FactoryBeanPojo) context.getBean("&factoryBeanPojo");
        System.out.println(school.getClass().getName());
        System.out.println(factoryBeanPojo.getClass().getName());
    }
}
