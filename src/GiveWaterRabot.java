import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by GuiRunning on 2017/7/2.
 * 模拟灌水机器人，一直灌水到满了后停止灌水
 */
public class GiveWaterRabot extends TimerTask {

    String name;
    Counter count;
    public GiveWaterRabot(String name, Counter count){
        this.name = name;
        this.count = count;
    }

    public String getName(){
        return name;
    }
    @Override
    public void run() {
        //格式化打印当前时间
        count.count++;
        try {
            Thread.sleep(1000);//模拟灌水所花的时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentime  = sf.format(new Date());
        if(count.count<10){
            System.out.println("count="+  count.count+currentime+getName());
        }else{
            System.out.println("count="+  count.count+currentime+getName()+"水满了");
            this.cancel();
        }
    }
}
