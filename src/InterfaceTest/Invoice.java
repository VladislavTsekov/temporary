package InterfaceTest;

public class Invoice implements  Payable {
    private String partNumber, partDescription;
    private int quantity;
    private double pricePerItem;

    public void setPartNumber (String part){ this.partNumber=part; }
    public void setPartDescription (String description) { this.partDescription=description; }
    public void setQuantity (int quant){this.quantity=Math.max(quant, 0);}
    public void setPricePerItem(double price){ this.pricePerItem=Math.max(price, 0.0);}

    public String getPartNumber() { return partNumber; }
    public double getPricePerItem() { return pricePerItem; }
    public int getQuantity() { return quantity; }
    public String getPartDescription() { return partDescription; }

    public Invoice (String identificationCode, String description, int count, double price){
        setPartNumber(identificationCode);
        setPartDescription(description);
        setQuantity(count);
        setPricePerItem(price);
    }
    @Override
    public double getPaymentAmount(){ return getQuantity() * getPricePerItem(); }

    public String toString(){
        return String.format( "%s: \n%s : %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice",
                "part number", getPartNumber(), getPartDescription(),
                "quantity",getQuantity(),
                "price per item", getPricePerItem());
    }

}
