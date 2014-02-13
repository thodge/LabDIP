package dip.lab1.student.solution1;

/**
 *
 * @author Tammie
 */
public class SalariedEmployee implements Employee {
    private String firstName;
    private String lastName;
    private int employeeSSN;
    private double yearlyWage;
    private double biweeklySalary;
    private static final double PAY_WEEKS = 26;

    public SalariedEmployee(double biweeklySalary) {
        setBiweeklySalary(biweeklySalary);
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
    
    
}
