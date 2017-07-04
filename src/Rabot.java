import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by GuiRunning on 2017/7/2.
 * 模拟跳舞机器人，先判断水有没有灌满没有的话就一直执行，有的话，就2秒后停止执行
 */
public class Rabot extends TimerTask {

    String name;
    public Rabot(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public void run() {
        //格式化打印当前时间
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentime  = sf.format(new Date());
        System.out.println(currentime+getName());
    }
}
