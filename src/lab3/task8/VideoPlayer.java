package lab3.task8;

public class VideoPlayer extends Player implements  Technique{
    private static boolean UserSwitch;
    private static int count;
    @Override
    public void On() {
        UserSwitch = true;
    }

    @Override
    public void Off() {
        UserSwitch = false;

    }
}
