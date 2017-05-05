package aspectj.start;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/5/5 下午3:18
 */
public class FigureElement {

    private Line line;

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public void draw(){
        System.out.println("draw方法被调用");
    }

    public static void main(String[] args){
        FigureElement figureElement = new FigureElement();
        figureElement.draw();
    }
}
