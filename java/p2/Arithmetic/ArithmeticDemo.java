package Arithmetic;

import java.util.Scanner;

class Rational {
    private int numerator;
    private int denominator;

    // constructor
    Rational(int n,int d){
        numerator = n;
        denominator = d;
    }

    // Function to add rational numbers
    public void add(Rational n2){
        int lcm = denominator * n2.denominator;
        numerator = numerator*lcm + n2.numerator*lcm;
        denominator = lcm;
    }

    // Function to subtract rational numbers
    public void sub(Rational n2){
        int lcm = denominator * n2.denominator;
        numerator = numerator*lcm - n2.numerator*lcm;
        denominator = lcm;
    }

    // Multiply
    public void multiply(Rational n2){
        numerator = numerator * n2.numerator;
        denominator = denominator * n2.denominator;
    }

    // Overriding toString Method
    public String toString(){
        return numerator + " / " + denominator;
    }
}

class Complex {

}

class ArithmeticDemo {
    public static void main(String[] args){
          Rational r1 = new Rational(2,3);
          Rational r2 = new Rational(3,4);

          // Add
          r1.add(r2);
          System.out.println(r1);

          // Sub
          r1.sub(r2);
          System.out.println(r1);

          // Mul
          r1.multiply(r2);
          System.out.println(r2);  
    }
}