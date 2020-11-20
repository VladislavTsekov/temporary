package InterfaceTest;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public void setWeeklySalary(double weeklySalary) { this.weeklySalary = Math.max(0.0,weeklySalary); }
    public double getWeeklySalary() { return weeklySalary; }

    public SalariedEmployee (String first, String last, String ssn, double salary){
        super (first, last, ssn);
        setWeeklySalary(salary);
    }

    @Override
    public double getPaymentAmount() { return getWeeklySalary(); }

    public String toString(){
        return String.format("Salaried employee: %s \n %s: $%.2f",
                super.toString(),"weekly salary", getWeeklySalary());
    }

}
