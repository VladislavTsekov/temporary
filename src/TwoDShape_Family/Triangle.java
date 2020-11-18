package TwoDShape_Family;

public class Triangle extends TwoDShape {
    private String style;

    Triangle(){
        super();
        style=null;
    }

    Triangle(String s, double w, double h){
        super(w,h,"triangle");
        style=s;
    }

    Triangle(double x){
        super(x,"triangle");
        style="isosceles";
    }

    Triangle(Triangle obj){
        super(obj);
        style=obj.style;
    }

    void showStyle(){ System.out.println("The triangle is "+style); }

    @Override
    double area() { return (getWidth() * getHeight()) / 2; }
}
