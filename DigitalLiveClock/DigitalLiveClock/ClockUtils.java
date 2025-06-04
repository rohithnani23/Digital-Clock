import java.text.SimpleDateFormat;
import java.util.Date;

class ClockUtils {
    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date());
    }
}
