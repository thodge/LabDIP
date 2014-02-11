package dip.lab1.student.solution1;

/**
 *
 * @author Tammie
 */
public class SalariedPlusBonusEmployee implements Employee{
    private String firstName;
    private String lastName;
    private int employeeSSN;
    private double yearlyWage;
    private double biweeklySalary;
    private static final double PAY_WEEKS = 26;
    private double yearlyBonus;

    public SalariedPlusBonusEmployee() {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getEmployeeSSN() {
        return employeeSSN;
    }

    public void setEmployeeSSN(int employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    @Override
    public double getYearlyWage() {
        yearlyWage = biweeklySalary * PAY_WEEKS;
        return yearlyWage;
    }

    public void setYearlyWage(double yearlyWage) {
        this.yearlyWage = yearlyWage;
    }

    public double getBiweeklySalary() {
        return biweeklySalary;
    }

    public void setBiweeklySalary(double biweeklySalary) {
        this.biweeklySalary = biweeklySalary;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
    
    
    
}
