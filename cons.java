import java.io.*;
 
class Garima{
    String name;
    int age;

    Garima(String name, int age){
        this.name= name;
        this.age= age;
    }
}
class cons{
    public static void main(String args[]){
        Garima g1 = new Garima("xyz", 20);
        System.out.println(g1.name);
        System.out.println(g1.age);
    }
}