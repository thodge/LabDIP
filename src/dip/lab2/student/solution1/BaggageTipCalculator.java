package dip.lab2.student.solution1;

/**
 *
 * @author Tammie
 */
public class BaggageTipCalculator implements TipCalculatorStrategy {

    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR
            = "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    public BaggageTipCalculator() {
    }
    
    

}
