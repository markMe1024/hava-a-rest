import static javax.swing.JOptionPane.*;

/**
 * @author mark
 * @date 2019/10/08
 */
public class Rest {
    /**
     * 时间间隔30min
     */
    private static final int INTERVAL = 30 * 60 * 1000;

    /**
     * 提示信息
     */
    private static final String ALERT_MESSAGE = "休息两分钟，活动一下脖子，也让眼睛休息一下";

    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(INTERVAL);
                showMessageDialog(null, ALERT_MESSAGE, null, PLAIN_MESSAGE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
