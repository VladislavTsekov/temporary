package TwoDShape_Family;
public abstract class TwoDShape {
    private double width, height;
    private String name;

    double getWidth(){return width;}
    double getHeight(){return height;}
    String getName(){return this.name;}

    void setWidth(double w){ this.width=w; }
    void setHeight(double h) { this.height = h;}

    TwoDShape(){  //default constructor
        setHeight(0.0);
        setWidth(0.0);
        name=null;
    }

    TwoDShape(double w, double h, String n){ //parameter constructor
        setHeight(h);
        setWidth(w);
        this.name=n;
    }
    TwoDShape(double x, String n){  //parameter constructor
        setHeight(x);
        setWidth(x);
        this.name=n;
    }

    TwoDShape(TwoDShape obj){  //copy constructor
        setHeight(obj.getHeight());
        setWidth(obj.getWidth());
        this.name=obj.getName();
    }

    TwoDShape(String n){
        this.name=n;
    }

    void showDim(){ System.out.println("Width = "+getWidth() + "\n Height = " + getHeight()); }

    abstract double area();

}

