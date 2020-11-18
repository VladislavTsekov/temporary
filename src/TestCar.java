import java.util.LinkedList;
public class TestCar  {
    public static void main(String[] args) {
        Car obj = new Car();
        LinkedList<Car> parking = new LinkedList<>();
        parking.add(new Car("nissan", "Dark Blue", "6 cylinder engine", "Variator", "Leaf", 73000,2017 ));
        parking.add (new Car("nissan", "White", "3 cylinder engine", "Sequential", "Micra",58000,2013)); // different nissan
        parking.add(new Car());
        parking.add(new Car("opel", "Balboa", "useless", "Idon'tUnderstandGearboxes", "Corsa E", 56000,2018));
        parking.add(new Car("bmw", "Red", "tooExpensive", "Automatic", "Series 1(F40)", 103000,2019));
        parking.add(new Car()); // x2 empty
        parking.add(new Car("opel", "Balboa", "useless", "Idon'tUnderstandGearboxes", "Corsa E", 56000,2018)); // x2 opel
        parking.add(new Car("volkswagen", "Gray", "1,5 litres", "Direct-shift gearbox 7", "Golf 8", 18000, 2019));
        parking.add(new Car()); // x3 empty
        parking.add(new Car("opel", "Balboa", "useless", "Idon'tUnderstandGearboxes", "Corsa E", 56000,2018)); // x3 opel

        parking.add(new Car());
        for (Car i : parking) { System.out.println(i.getBrand()); } // show the initial list
        System.out.println("-----------");
        LinkedList <Car> clearTest = obj.clear(parking);
        for (Car i : clearTest) { System.out.println(i.getBrand()); } // show the cleared list
        System.out.println("-----------1");
        LinkedList<Car> filterTester = obj.filter(parking, 'n'); // show the filtered list
        for (Car i : filterTester) { System.out.println(i.getBrand()); }
        System.out.println("-----------");
        LinkedList<Car> sortTester1 = obj.sort(parking, false); // show the descending list
        for (Car i : sortTester1) { System.out.println(i.getBrand()); }
        System.out.println("-----------");
        LinkedList<Car> sortTester2 = obj.sort(parking, true); // show the ascending list
        for (Car i : sortTester2) { System.out.println(i.getBrand()); }
    }
}
