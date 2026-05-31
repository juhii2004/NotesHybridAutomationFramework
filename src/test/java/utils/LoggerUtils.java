package utils;

public class LoggerUtils {

    public static void logInfo(
            String message) {

        System.out.println(
                "[INFO] : " + message);
    }

    public static void logError(
            String message) {

        System.out.println(
                "[ERROR] : " + message);
    }

    public static void logWarning(
            String message) {

        System.out.println(
                "[WARNING] : " + message);
    }
}