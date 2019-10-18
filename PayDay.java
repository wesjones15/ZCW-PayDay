
/**
 * Write a description of class PayDay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayDay
{
    // instance variables - replace the example below with your own
    private String name;
    private double hourlyPayRate;
    private double hoursWorked;
    private double deduction;

    /**
     * Constructor for objects of class PayDay
     */
    public PayDay(String name, double hourlyPayRate, double hoursWorked, double deduction)
    {
        // initialise instance variables
        this.name = name;
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
        this.deduction = deduction;
    }

    /**
     * Class Methods
     */
    public String subStr() {
        String sample = "Hello";
        return sample.substring(1,3); // 1 <= x < 3 returns "el"
    }
    public double getGrossPay() {
        double gross = hourlyPayRate * hoursWorked;
        return gross;
    }
    
    public double getAmountDeducted(double gross) {
        double amountDeducted = gross * deduction;
        return amountDeducted;
    }
    
    public double getNetPay(double gross, double amountDeducted) {
        double netPay = gross - amountDeducted;
        return netPay;
    }
    
    public String getPayStub() {
        double gross = getGrossPay();
        double amountDeducted = getAmountDeducted(gross);
        double netPay = getNetPay(gross, amountDeducted);
        
        String payStub = name + " " + String.format("%.2f",gross) + " " + String.format("%.2f",amountDeducted) + " " + String.format("%.2f",netPay);
        return payStub;
    }
}
