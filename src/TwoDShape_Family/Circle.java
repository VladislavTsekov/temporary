package TwoDShape_Family;
import java.lang.Math;
public class Circle extends TwoDShape {
    private double radius; //Pi*r^2
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    Circle (){ super("circle"); setRadius(1); }
    Circle (double r) { super("circle"); setRadius(r); }
    Circle (Circle obj) {super("circle"); setRadius(obj.getRadius());}

    @Override
    double area() { return Math.PI*Math.pow(getRadius(),2); }
}
