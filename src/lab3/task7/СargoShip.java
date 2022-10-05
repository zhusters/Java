package lab3.task7;

public abstract class СargoShip implements Ship {
    private int speed;
    private String name;

    void CheckName() {
    }

    void Shoot() {
        System.out.println("peace");
    }

    @Override
    public void SafeWhale() {
        boolean flag = true;
    }
}
