package beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/4/24 下午5:34
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor(){
        System.out.println("BeanPostProcessor:构造器方法调用");
    }


    //第一个参数是要处理的Bean对象,第二个参数是Bean的name
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor:postProcessBeforeInitialization方法调用");
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor:postProcessAfterInitialization方法调用");
        return null;
    }
}
