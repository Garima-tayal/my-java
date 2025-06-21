interface shape{
    int calArea();
}
class rectangle implements shape{
    private int length;
    private int width;

    public rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }
    public int calArea(){
        return length * width;
    }
}
public class inter{
    public static void main(String[] args) {
        rectangle r1 = new rectangle(4,6);
        System.out.println("area of rectangle is:"+ r1.calArea());
    }
}