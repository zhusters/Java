package lab3.task8;

public abstract class Player {
    private boolean UserSwitch;
    private int count;

    void Start(Player p){
    }
    void Stop(Player p){
    }

    void Next(Player p){
        p.count++;

    }
    void Previous(Player p){
        p.count--;
    }

}
