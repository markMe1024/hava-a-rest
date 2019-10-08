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
    private static final String ALERT_MESSAGE = "Rest for two minutes, relax your neck muscles, and look into the distance";

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
