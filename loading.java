class help{
    static int mul(int a, int b){
        return a*b;
    }
    static double mul(double a, double b){
        return a*b;
    }
}
public class loading {
    public static void main(String[] args) {
        System.out.println(help.mul(2, 5));
        System.out.println(help.mul(2.2, 5.6));
    }   
}
