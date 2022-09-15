import java.awt.Rectangle;


public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(1,2,3,4);
        Rectangle r3= new Rectangle(3,4);

        System.out.println(r2.calculateArea(r2.width,r2.height));


    }
}