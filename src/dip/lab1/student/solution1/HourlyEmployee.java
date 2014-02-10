package dip.lab1.student.solution1;

/**
 *
 * @author Tammie
 */
public class HourlyEmployee extends HRService implements Employee{
    private String firstName;
    private String lastName;
    private int employeeSSN;
    private double yearlySalary;

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
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    
    
}
