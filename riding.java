class parent{
    void move (){
        System.out.println("parent");
    }
}
class child extends parent{
    void move(){
        System.out.println("child");
    }
}
public class riding {
    public static void main(String[] args) {
    child c1 = new child();
    c1.move();
    }
}
