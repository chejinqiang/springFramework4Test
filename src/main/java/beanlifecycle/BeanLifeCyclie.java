package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/4/24 下午5:48
 */
public class BeanLifeCyclie {

    public static void main(String[] args){
        System.out.println("现在开始初始化容器");
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器初始化成功");

        //关闭容器
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();
    }
}
