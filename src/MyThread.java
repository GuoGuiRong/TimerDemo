import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by GuiRunning on 2017/7/2.
 */
public class MyThread extends TimerTask {

    private String name;

    public MyThread(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }

    public MyThread(String name ){
        System.out.println("创建时间："+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(getName()+"运行时间:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }
}
