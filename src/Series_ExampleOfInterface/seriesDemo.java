package Series_ExampleOfInterface;

public class seriesDemo {
    public static void main(String[] args) {
        byTwos twoObj = new byTwos();
        byThree threeObj= new byThree();
        Series obj=twoObj;
        for (int i = 0; i < 5; i++) { System.out.println("The next value is "+obj.getNext() + "!"); }
        System.out.println("\n Resetting. . .");   /* || */ twoObj.reset();
        System.out.println("\n Starting at 30!");  /* || */ twoObj.start(30);
        for (int i = 0; i < 5; i++) { System.out.println("The next value is "+twoObj.getNext() + "!"); }
        System.out.println("\n Starting at 100!");
        obj=threeObj;
        obj.start(100);
        for (int i = 0; i < 5; i++) { System.out.println("The next value is "+obj.getNext() + "!"); }
        System.out.println("\n Resetting. . .");   /* || */ twoObj.reset(); threeObj.reset();
        for (int i = 0; i < 5; i++) {
            obj=twoObj;
            System.out.println("The next byTwos value is "+obj.getNext());
            obj=threeObj;
            System.out.println("The next byThree value is "+obj.getNext());
        }
    }
}
