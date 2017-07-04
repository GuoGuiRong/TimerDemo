import java.util.Date;
import java.util.Timer;

/**
 * 关于Timer 定时器的使用
 * 详细可以查看api
 */
public class Main {

    /**
     *  scheduleAtFixedRate 和 schedule的区别是
     *  scheduleAtFixedRate的指定执行时间如果小于
     *  当前时间，那么启动时会自动追赶进度，存在同一时间可能同时运行了多次线程
     *
     *  schedule 则不会追赶进度
     *
     */
    public static void main(String[] args) {

        MyThread timer3 = new MyThread("timer3");

        Timer timer = new Timer();

        //3秒之后开启线程
       // timer.schedule(timer1,3000L);

        //什么时候开启，如果时间小于当前时间，就马上启动线程
        //timer.schedule(timer2,new Date());

        //什么时候开始，每period毫秒执行一次
       // timer.schedule(timer3,new Date(System.currentTimeMillis()+2000L),1000L);

        //1秒后启动，每2秒执行一次
       // timer.schedule(timer3,1000L,2000L);

        //1秒后启动，每2秒执行一次
       // timer.scheduleAtFixedRate(timer3,1000L,2000L);

        //2秒后启动，每2秒执行一次
      //  timer.scheduleAtFixedRate(timer3,new Date(System.currentTimeMillis()+2000L),1000L);

        //2秒后启动，每2秒执行一次
       // timer.scheduleAtFixedRate(timer3,new Date(),1000L);

       // timer.scheduleAtFixedRate(timer3,new Date(System.currentTimeMillis()-10000L),1000L);

        timer.schedule(timer3,new Date(System.currentTimeMillis()-2000L),1000L);

        //清楚所有取消的任务从任务队列中，释放资源
        timer.purge();

        //取消当前时间队列上的调度器
        timer.cancel();

        //取消本线程
        timer3.cancel();
    }
}
