package EXCEPTION;

/**
 * Created by taiseerhabib on 5/20/16.
 */
public class Calculator {

    double result;

    public double calculatorAdd(int a, int b){
        result = a+b;
        return result;
    }

    public double calculatorSubtract(int a, int b){
        result = a-b;
        return result;
    }

    public double calculatorMultiply(int a, int b) {
        result = a*b;
        return  result;
    }

    public double calculatorDivide(int a, int b) throws DivisionByZeroException {
        if(b ==0){
            throw new DivisionByZeroException("Error2");
        }
        result = a/b;
        return result;
    }

    public double squareRoot (double a) throws ComplexNumberException {
        if(a < 0){
            throw new ComplexNumberException();
        }
        result = Math.sqrt(a);
        return result;
    }



}
