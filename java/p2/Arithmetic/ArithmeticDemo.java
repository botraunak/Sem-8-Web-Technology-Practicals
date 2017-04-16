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
    private int real;
    private int imaginary;

    Complex(int real, int imaginary){
      this.real = real;
      this.imaginary = imaginary;
    }

    public void add(Complex n2){
      this.real = this.real + n2.real;
      this.imaginary = this.imaginary + n2.imaginary;
    }

    public void sub(Complex n2){
      this.real = this.real - n2.real;
      this.imaginary = this.imaginary - n2.imaginary;
    }

    public void multiply(Complex n2){
      this.real = this.real * n2.real - this.imaginary * n2.imaginary;
      this.imaginary = this.real * n2.imaginary + this.imaginary * n2.real;
    }

    // Overriding toString Method
    public String toString(){
      return this.real + " + " + this.imaginary + "i";
    }
}

class ArithmeticDemo {
    public static void main(String[] args){
          // Showing Rational Numbers
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

          // Showing Complex Numbers
          Complex c1 = new Complex(1,2);
          Complex c2 = new Complex(2,3);

          // Add
          c1.add(c2);
          System.out.println(c1);

          // Subtract
          c1.sub(c2);
          System.out.println(c1);

          // Multiply
          c1.multiply(c2);
          System.out.println(c1);  
    }
}