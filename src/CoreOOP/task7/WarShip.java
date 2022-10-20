package CoreOOP.task7;

public abstract class WarShip implements Ship{
    private int speed;
    private String name;

    void Shoot(){
        System.out.println("war");

    }
    void CheckName(){}
    @Override
    public void SafeWhale() {

        boolean flag = false;
        System.out.println(flag);
    }
}
