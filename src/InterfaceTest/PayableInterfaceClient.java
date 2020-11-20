package InterfaceTest;

public class PayableInterfaceClient {
    public static void main(String[] args) {
        Payable[] objects = new Payable [4];
        objects[0] = new Invoice("69420", "seat", 2,399);
        objects[1] = new Invoice("01110","headphones", 7, 85.99);
        objects[2] = new SalariedEmployee("Will","Smith","011-22-1121",400);
        objects[3] = new SalariedEmployee("Huge","PP","888-79-4484", -120);
        System.out.println("Invoices and Employess processed polymorphically:\n");
        for ( Payable i : objects){
            System.out.printf("%s \n %s: $%.2f\n\n",
                    i.toString(),
                    "payment due", i.getPaymentAmount());
        }
    }
}
