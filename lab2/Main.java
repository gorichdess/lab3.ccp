import java.awt.geom.Line2D;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        final double a = -11;
        final double b = 0.5;
        final double x0 = 21.1;

        final Function expression1 = Sum.of(
                CubeRoot.of(
                        NaturalLogarithm.of(
                                Absolute.of(
                                        HyperbolicTangent.of(
                                                Linear.of(a)
                                        )
                                )
                        )
                ),
                Multiplication.of(
                        Const.of(-1),
                        Power.of(
                                Cosine.of(
                                        Sum.of(Linear.of(b), Const.of(a))
                                ),
                                Const.of(3)
                        )
                )
        );
        final NumberFormat nf = NumberFormat.getInstance();
        System.out.format("f1 (x) = %s", expression1.toPrettyString(nf)).println();
        System.out.format("f1'(x) = %s", expression1.derivative().toPrettyString(nf)).println();
        System.out.format("f1 (%.2f) = %f", x0, expression1.calculate(x0)).println();
        System.out.format("f1'(%.2f) = %f", x0, expression1.derivative().calculate(x0)).println();

        final Function expression2 =
                Multiplication.of(
                        Linear.X,
                        Power.of(
                                HyperbolicSine.of(
                                        Absolute.of(
                                                Multiplication.of(
                                                        Const.of(a),
                                                        CubeRoot.of(Cosine.of(
                                                                Linear.of(b)
                                                        ))
                                                )
                                        )
                                ),
                                Const.of(2)
                        )
                );
        System.out.format("f2(x) = %s", expression2.toPrettyString(nf)).println();
        System.out.format("f2'(x) = %s", expression2.derivative().toPrettyString(nf)).println();
        System.out.format("f2(%.2f) = %f", x0, expression2.calculate(x0)).println();
        System.out.format("f2'(%.2f) = %f", x0, expression2.derivative().calculate(x0)).println();
    }
}

