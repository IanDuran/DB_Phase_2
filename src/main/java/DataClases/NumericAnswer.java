package DataClases;

/**
 * Created by Ian on 5/18/2017.
 */
public class NumericAnswer {
    private double result;
    private String units;

    public NumericAnswer(double result, String units) {
        this.result = result;
        this.units = units;
    }

    public double getResult() {
        return result;
    }

    public String getUnits() {
        return units;
    }
}
