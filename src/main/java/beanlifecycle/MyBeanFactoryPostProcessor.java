package beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/4/24 下午5:39
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

    public MyBeanFactoryPostProcessor(){
        System.out.println("BeanFactoryPostProcessor:调用构造方法");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor:调用postProcessBeanFactory方法");
    }
}
