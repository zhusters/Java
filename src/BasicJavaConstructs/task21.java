package BasicJavaConstructs;

public class task21 {
    public static void main(String[] args) {
        long a = (int) ( Math.random() * 28800 );
        System.out.println("second - "+a);
        System.out.println(timeToString(a));

    }
    private static String timeToString(long secs) {
        long hour = secs / 3600,
                min = secs / 60 % 60,
                sec = secs / 1 % 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
