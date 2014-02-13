package dip.lab2.student.solution1;

/**
 *
 * @author Tammie
 */
public class TipService {

    private TipCalculatorStrategy tipCalculatorStrategy;

    public double getTip() {
        return tipCalculatorStrategy.getTip();
    }

    public TipService(TipCalculatorStrategy tipCalculatorStrategy) {
        this.tipCalculatorStrategy = tipCalculatorStrategy;
    }

}
