package ua.zp.brain;

import static ua.zp.brain.MathUtil.*;

public class TestStatic {

    public static void main(String[] args) {

        System.out.println("Sum of values: " + sum(3,3,5,10));
        System.out.println("Multiply of values: " +  mul(1,1,5,10));

        System.out.print("Print with skipping: ");
        printWithSkip(1,1,5,10,1,2,1,5,1,8,8);
        System.out.println();
        System.out.print("Print with interrupt: ");
        printToValue(15,1,5,10,1,2,1,15,1,8,8);
        System.out.println();

        System.out.println("Factorial of value: " + factorial(5));
        System.out.println("Harmonic progression: " + geometricProgression(3, 4, 4));
        System.out.println("Arithmetic progression: " + arithmeticProgression(2, 4, 3));
    }
}
