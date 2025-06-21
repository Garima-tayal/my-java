class one {
    public void parent(){
        System.out.println("i am parent");
    }
}
class two extends one {
    public void child(){
        System.out.println("i am a child");
    }
}
public class inherit {
   public static void main(String[] args) {
    two t = new two();
    t.parent();
    t.child();
    t.parent();
   } 
}
