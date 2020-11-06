package task1;

import org.apache.commons.math3.complex.Complex;

public class ConcreteFactory implements ComplexAbstractFactory {
    Complex c;

    public ConcreteFactory() {
        c = createComplex();
    }

    public ConcreteFactory(int real, int image) {
        c = CreateComplex(real, image);
    }

    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }

    @Override
    public String toString() {
        return "" + c;
    }
}
