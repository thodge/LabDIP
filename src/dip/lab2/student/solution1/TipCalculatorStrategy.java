package dip.lab2.student.solution1;

/**
 *
 * @author Tammie
 */
public interface TipCalculatorStrategy {

    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }

    public abstract double getTip();

}
