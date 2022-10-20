package CoreOOP.task9;

public abstract class Car {
    private int power;
    private String color;
    private int wheel;
    private String name;


    void FullWheelDrive(){

    }
    void HalfWheelDrive(){

    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public int getWheel() {
        return wheel;
    }

    public String getName() {
        return name;
    }
}
