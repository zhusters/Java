package CoreOOP.task6;

public abstract class PublicBuilding implements Building{
    private int floor;
    private int room;
    private String  name;

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public int getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Build() {

    }
}
