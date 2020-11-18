import java.util.*;
public class Car {
    private String brand;
    private String model;
    private String color;  // brand model color power engineType gearbox year
    private int power;
    private String engineType;
    private String gearBox;
    private int year;

    public int getPower() { return power; }
    public int getYear() { return year; }
    public String getBrand() { return brand; }
    public String getColor() { return color; }
    public String getEngineType() { return engineType; }
    public String getGearBox() { return gearBox; }
    public String getModel() { return model; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setColor(String color) { this.color = color; }
    public void setEngineType(String engineType) { this.engineType = engineType; }
    public void setGearBox(String gearBox) { this.gearBox = gearBox; }
    public void setModel(String model) { this.model = model; }
    public void setPower(int power) { if (power>10) this.power = power; else this.power=15; }
    public void setYear(int year) { if (year>1950) this.year = year; else this.year=1950; }

    public Car (){
        setBrand("undefined");
        setColor("undefined");
        setEngineType("undefined");
        setGearBox("undefined");
        setModel("undefined");
        setPower(0);
        setYear(1950);
    }
    public Car (String brand, String color, String engine, String gearBox, String model, int power, int year){
        setBrand(brand);
        setColor(color);
        setEngineType(engine);
        setGearBox(gearBox);
        setModel(model);
        setPower(power);
        setYear(year);
    }


    public LinkedList<Car> sort (LinkedList<Car> arr, boolean upDown){
        LinkedList<Car> reverse = new LinkedList<>();
        Collections.sort(arr, (obj1, obj2) -> obj2.getBrand().compareTo(obj1.getBrand())); // creating NEW "custom" comparator
        for (int i = 0; i < arr.size(); i+=1) { reverse.add(arr.get(arr.size()-i-1)); } // reversing it in case the user wants it descending
        if (!upDown) return arr;
        else return reverse;
    }

    public LinkedList<Car> clear (LinkedList<Car> arr) {
        for (int i = 0 ; i < arr.size(); i+=1)
            for (int j = i; j < arr.size(); j += 1)
                if (arr.get(i).getBrand().equals(arr.get(j).getBrand()) &&
                        arr.get(i).getModel().equals(arr.get(j).getModel()) &&
                        arr.get(i).getColor().equals(arr.get(j).getColor()) &&
                        arr.get(i).getEngineType().equals(arr.get(j).getEngineType()) &&
                        arr.get(i).getGearBox().equals(arr.get(j).getGearBox()) &&
                        arr.get(i).getYear() == arr.get(j).getYear() &&
                        arr.get(i).getPower() == arr.get(j).getPower() &&
                        i != j) {
                    arr.remove(j);
                    j -= 1;
                }
        return arr;
    }

    public LinkedList<Car> filter (LinkedList<Car> arr, char sorter){
        LinkedList<Car> result = new LinkedList<>();
        for (Car i : arr) if (i.getBrand().charAt(0)==sorter) result.add(i);
        return result;
    }
}
