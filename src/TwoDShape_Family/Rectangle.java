package TwoDShape_Family;
public class Rectangle extends TwoDShape {

    Rectangle(){ super(); }

    Rectangle(double w, double h){ super (w,h,"rectangle"); }

    Rectangle(double x){ super(x, "square"); }

    Rectangle(Rectangle obj){ super(obj); }

    boolean isSquare(){
        if(getName().equals("square")) return true;
        else return false;
    }

    @Override
    double area() { return getWidth() * getHeight(); }
}
