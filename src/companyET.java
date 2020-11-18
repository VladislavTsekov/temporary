public class companyET {
    String owner;
    double investment,capital;

    public double getCapital() { return capital; }
    public double getInvestment() { return investment; }
    public String getOwner() { return owner; }

    public void setCapital(double capital) { this.capital = capital; }
    public void setInvestment(double investment) { this.investment = investment; }
    public void setOwner(String owner) { this.owner = owner; }

    public double grossProfit (){ return getCapital()-getInvestment(); }
}
