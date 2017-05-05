package aspectj;

import org.aspectj.weaver.ast.Call;
import org.aspectj.weaver.loadtime.definition.Definition;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/5/5 下午2:18
 *
 * join point:程序中定义好的点,比如方法调用
 * pointcut:切点,从join point中取出一些点
 * advice:当程序到达join point时执行的代码片
 *        advice有五种类型:before,after,type around
 * inter-type declarations:允许修改程序的静态结构(类成员以及类之间的关系)
 * aspect:包含pointcuts,advice,inter-type declarations,横切关注点的模块化单元
 * target:被横切的对象
 */
public class App {

public static void main(String[] args){

}

//定义切点


}
