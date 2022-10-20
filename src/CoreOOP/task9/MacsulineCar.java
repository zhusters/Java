package CoreOOP.task9;

public class MacsulineCar extends Car implements Auto {
    private static boolean go;

    @Override
    public void Drive() {
        go = true;
    }

    @Override
    public void Brake() {
        go = false;
    }

    @Override
    void FullWheelDrive() {
        super.setWheel(4);
    }

    @Override
    void HalfWheelDrive() {
        super.setWheel(2);
    }
}
