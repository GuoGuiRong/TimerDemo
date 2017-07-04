import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by GuiRunning on 2017/7/2.
 * 模拟跳舞机器人，先判断水有没有灌满没有的话就一直执行，有的话，就2秒后停止执行
 */
public class DancingRabot extends TimerTask {

    String name;
    Counter count;
    long time;
    public DancingRabot(String name,Counter count){
        this.name = name;
        this.count = count;
    }

    public String getName(){
        return name;
    }
    @Override
    public void run() {

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentime  = sf.format(new Date());
        System.out.println("count="+count.count+currentime+getName());

        if(count.count==10){
           time = scheduledExecutionTime();//获取灌满水的时间点
            count.count=11;
        }
        /**
         * 如果睡衣筋骨干满了，就再跳2秒钟后停止
         */
        if(System.currentTimeMillis()-time==2000){
            this.cancel();
        }
    }
}
