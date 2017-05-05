package aspectj.start;


/**
 * Created by chejinqiang on 17/5/5.
 */
public aspect HelloAspect {

    pointcut HelloWorldPointCut() : execution(* FigureElement.draw());

    //advice将pointcut和代码片相结合
    before() : HelloWorldPointCut(){
        System.out.println("hello world");
    }
    after() returning : move(){
        System.out.println("just successfully returned");
    }

    after() throwing : move(){
        System.out.println("after throw a exception");
    }

    after() : move(){
        System.out.println("类似于finally,runs after returning or throwing");
    }

    pointcut move():
            call(void Point.getX()) ||
                    call(void Point.getY()) ||
                    call(* Line.get*(..));


    //cflow取出所有的join point存在于(move方法定义的连接点的动态上下文中)
    pointcut HelloWorldCflow() : cflow(move());


}
