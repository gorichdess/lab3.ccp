import java.text.NumberFormat;

public class HyperbolicSine extends Composite {

    public HyperbolicSine(Function term) {
        super(term);
    }

    @Override
    public double calculate(double x) {
        return Math.sinh(terms().get(0).calculate(x));
    }

    @Override
    public Function derivative() {
        Function term = terms().get(0);
        return Multiplication.of(HyperbolicCosine.of(term), term.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        return "sh(" + terms().get(0).toPrettyString(nf) + ")";
    }

    public static HyperbolicSine of(Function term){
        return new HyperbolicSine(term);
    }

}
