package task1;

import org.apache.commons.math3.complex.Complex;

public interface ComplexAbstractFactory {
    Complex createComplex();
    Complex CreateComplex(int real, int image);
}
