package utils;

public class WaitUtils {

    public static void hardWait(
            int milliseconds) {

        try {

            Thread.sleep(milliseconds);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}