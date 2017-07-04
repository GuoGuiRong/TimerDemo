import java.util.Date;
import java.util.Timer;

/**
 * Created by GuiRunning on 2017/7/2.
 */
public class TestDemo {

    public static void main(String[] args) {

       Counter count = new Counter();
        //创建两个机器人
        DancingRabot r1 = new DancingRabot("跳舞",count);
        GiveWaterRabot r2 = new GiveWaterRabot("灌水",count);

        Timer timer = new Timer();

        //马上执行
        timer.schedule(r1,new Date(),1000);

        //马上执行
        timer.schedule(r2,new Date(),1000);

    }
}
