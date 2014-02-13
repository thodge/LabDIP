package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author Tammie
 */
public class Startup {
    
    public static void main(String[] args) {
        
    
    
            //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50,40);
        Employee emp2 = new SalariedEmployee(5000);
       
        
        // Create a collection that we can process as a group --
        // demands polymorphic behavior
        Employee[] employees = {emp1, emp2};

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output by looping over collection in a way that
        // doesn't break if we add/subtract employees from array
        for(int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" +
            nf.format(hr.getYearlyWage(employees[i])));
        }
    }
    
}
