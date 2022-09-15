

public class Rectangle {
    //Fyra instansvariabler :x, y, width, heigth
    public double x;
    public double y;
    public double width;
    public double height;

    //Ska har 3 konstruktörer
    //en som inte tar emot ngt och som sätter alla instansvariabler till 0
    public Rectangle (){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    //en som tar emot två värden som sätts in i width och height medan x och y sätts till 0.
    public Rectangle (double width, double height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    //en som tar emot fyra värden som används för att sätta de fyra instansvariablerna.
    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //en instansmetod calculateArea som returnerar en double med rektangelns area
    public double calculateArea(double width, double height){
       this.width = width;
       this.height = height;
       return width*height;
    }


    //en instansmetod calculatePerimeter som returnerar en double med rektangelns omkrets.
    public  double calculatePerimeter(){
        this.width = width;
        this.height = height;
        return (width + height * 2);
    }

    //en instansmetod setXY som låter dig sätta instansvariablerna x och y.
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

//två instansmetoder setWidth och setHeight som låter dig sätta motsvarande instansvariabler.

    public void setWidth(int width) {
        this.width = width;
    }


    public void setHeight(int height) {
        this.height = height;
    }
}
