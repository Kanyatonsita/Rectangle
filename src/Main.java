
public class Main {
    public static void main(String[] args) {
         Rectangle r1 = new Rectangle();
         Rectangle r2 = new Rectangle(2,4);
        Rectangle r3 = new Rectangle(3,4);

        System.out.println(r1);
        System.out.println (r2.calculateArea(r2.width,r2.height));
        System.out.println(r3.calculatePerimeter(r3.width,r3.height));


    }
}