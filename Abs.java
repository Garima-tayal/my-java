abstract class myclass{
    abstract void on();
    abstract void off();
}
class TV extends myclass {
    void on(){
        System.out.println("on the TV");
    }
    void off(){
        System.out.println("off the TV");
    }
}
public class Abs{
public static void main(String args[]){
    myclass r1 = new TV();
    r1.on();
    r1.off();
}
}
