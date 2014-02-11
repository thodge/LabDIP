package dip.lab1.student.solution1;

/**
 *
 * @author Tammie
 */
public class HourlyEmployee implements Employee{
    private String firstName;
    private String lastName;
    private int employeeSSN;
    private double yearlyWage;
    private double biweeklyHoursWorked;
    private double hourlyWage;
    private static final double PAY_WEEKS = 26;

    public HourlyEmployee(double hourlyWage, double biweeklyHoursWorked) {
        setHourlyWage(hourlyWage);
        setBiweeklyHoursWorked(biweeklyHoursWorked);
        
    }

    public double getBiweeklyHoursWorked() {
        return biweeklyHoursWorked;
    }

    public void setBiweeklyHoursWorked(double biweeklyHoursWorked) {
        this.biweeklyHoursWorked = biweeklyHoursWorked;
    }
    

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
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
    

    public int getEmployeeSSN() {
        return employeeSSN;
    }

    public void setEmployeeSSN(int employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    @Override
    public double getYearlyWage() {
        yearlyWage = hourlyWage * biweeklyHoursWorked;
        return yearlyWage;
    }

    public void setYearlyWage(double yearlyWage) {
        this.yearlyWage = yearlyWage;
    }
    
    
    
}
