import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

class ClockTimer {
    private final JLabel timeLabel;
    private final Timer timer;
    private final SimpleDateFormat formatter;

    public ClockTimer(JLabel timeLabel) {
        this.timeLabel = timeLabel;
        formatter = new SimpleDateFormat("HH:mm:ss");
        timer = new Timer(1000, e -> updateTime());
    }

    public void start() {
        timer.start();
    }

    private void updateTime() {
        timeLabel.setText(formatter.format(new Date()));
    }
}