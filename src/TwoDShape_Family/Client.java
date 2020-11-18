package TwoDShape_Family;

public class Client {
    public static void main(String[] args) {
        TwoDShape shapes [] = new TwoDShape[5];
        shapes[0] = new Triangle("right", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7);
        shapes[4] = new Circle(5);

        for (int i=0; i<shapes.length; i+=1){
            System.out.println("The object is "+shapes[i].getName());
            System.out.format("It's area is %.2f",shapes[i].area());
            System.out.println("\n");
        }
    }

}
