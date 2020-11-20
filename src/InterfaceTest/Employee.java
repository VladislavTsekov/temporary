package InterfaceTest;

public abstract class Employee implements  Payable {
    private String firstName, lastName, socialSecurityNumber;

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSocialSecurityNumber(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    public Employee(String first, String last, String ssn){
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);
    }

    public String toString(){
        return String.format("%s %s \n social security number: %s",
                getFirstName(),getLastName(),getSocialSecurityNumber());
    }

}
