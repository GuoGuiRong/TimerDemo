import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by GuiRunning on 2017/7/4.
 */
public class SayLove extends TimerTask {

    @Override
    public void run() {
        //获取当前时间
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String curentTime  = sf.format(new Date());
        System.out.println("The clock is "+curentTime+" I just want to tell you that i love you");
    }

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer("MyTimer");

        SayLove sayLove = new SayLove();

        //一秒中后执行
       // timer.schedule(sayLove,1000L);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String curentTime  = sf.format(new Date());
        System.out.println("Now is "+curentTime);

        Date d = new Date();

        //d.setTime(d.getTime()+3000L);
        //schedule在指定时间点执行,如果指定时间过去了,那么启动后直接执行，但不会追赶进度
        //timer.schedule(sayLove,d);
        d.setTime(d.getTime()-5000L);
        //启动时间点d,每秒执行一次
        //timer.schedule(sayLove,d,1000L);

        //n秒后启动,每m秒执行一次
        //timer.schedule(sayLove,2000L,2000L);

        //scheduleAtFixedRate在指定时间点执行,如果指定时间过去了,那么启动后直接执行，为了追赶进度，同时执行多遍
        timer.scheduleAtFixedRate(sayLove,d,1000L);

       /* Thread.sleep(3000L);

        sayLove.cancel();//取消任务

        Thread.sleep(5000L);

        timer.cancel();//取消调度器*/

    }
}
