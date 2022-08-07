package Exceptions;

public class Fraction {
    private int numerator;
    private int denominator;

//    public Fraction(int numerator, int denominator) throws Exception {
//        this.numerator = numerator;
//        if(denominator == 0) {
////            Exception e = new Exception("Denominator can't be 0");
//            throw new Exception("Denominator can't be 0");
//        }
//        this.denominator = denominator;
//        simplify();
//    }

    public Fraction(int numerator, int denominator) throws ZeroDenominatorException {
        this.numerator = numerator;
        if(denominator == 0) {
            throw new ZeroDenominatorException();
        }
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i <= smaller; i++) {
            if(numerator % i == 0 && denominator % i == 0)
                gcd = i;
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) throws ZeroDenominatorException {
        if(denominator == 0) {
            throw new ZeroDenominatorException();
        }
        this.denominator = denominator;
        simplify();
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void print() {
        if(denominator == 1)
            System.out.println(numerator);
        else System.out.println(numerator + "/" + denominator);
    }

    public static Fraction add(Fraction f1, Fraction f2) throws ZeroDenominatorException {
        int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDen = f1.denominator * f2.denominator;
        return new Fraction(newNum, newDen);
    }

    public void add(Fraction f2) {
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2) {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }


}
