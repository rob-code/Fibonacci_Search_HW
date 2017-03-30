package com.codeclan.myapplication;


import static java.lang.Math.*;

public class FibonacciSearch {

    private double angle;
    private double sin_theta;
    private double angle_in_radians;
    private double upper_limit = 6;
    private double lower_limit = 0.5;


//public FibonacciSearch(double angle) {
//    this.angle = angle;
//}

    public double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    public double getSin(double new_angle) {
        angle = new_angle;
        angle_in_radians = Math.toRadians(angle);
        return Math.sin(angle_in_radians);
    }

//    public void listValuesOfSin(){
//        for (int i = lower_limit; i < upper_limit; i++){
//            double a = i;
//            double radians = Math.toRadians(a);
//            System.out.println("Sine of angle " + i + " = " + Math.sin(radians));
//            }
//    }

    public int fibMinusOne(int fib){
        int fibMinusOne = fib;
        return 13;
        //return fibMinusOne;
    }


    public double findMaximumByFibonacciSearch1(int Fn){

//      initialise the number of increments in the range...
        double s = (upper_limit - lower_limit)/Fn;   //correct

        System.out.println("s = " + s);

        double x_2 = lower_limit + (s * fibMinusOne(Fn));
        double x_1 = upper_limit - (s * fibMinusOne(Fn));

        System.out.println("x_1 = " + x_1 + ", x_2 = " + x_2 );

        double sin_x_1 = Math.sin(toRadians(x_1));
        double sin_x_2 = Math.sin(toRadians(x_2));

        System.out.println("sin_x_1 = " + sin_x_1 + ", sin_x_2 = " + sin_x_2 );

        double lower_bound = x_1;
        double upper_bound = x_2;


    while (Math.abs(x_2 - x_1) > s) {

    if (sin_x_1 < sin_x_2) {
        System.out.println("sin_x_1 < sin_x_2");
        System.out.println("sin_x_1 = " + sin_x_1 + ", sin_x_2 = " + sin_x_2 );

        lower_bound = x_1;
        x_1 = x_2;
        sin_x_1 = sin_x_2;
        x_2 = upper_bound - (x_1 - lower_bound);
        sin_x_2 = Math.sin(toRadians(x_2));
    } else {
        System.out.println("sin_x_1 > sin_x_2");
        System.out.println("sin_x_1 = " + sin_x_1 + ", sin_x_2 = " + sin_x_2 );

        upper_bound = x_2;
        x_2 = x_1;
        sin_x_2 = sin_x_1;
        x_1 = lower_bound + (upper_bound - x_2);
        sin_x_1 = Math.sin(toRadians(x_1));
    }
        System.out.println(x_1 + " " + x_2 );

    }

        return 3;


    }


    public double findMaximumByFibonacciSearch2(int Fn){

        // set first check points - max has to be within these.
        double x_1 = lower_limit;
        double x_2 = upper_limit;

        System.out.println(x_1 + " " + x_2 );

        double fn1 = 67 + (24 * x_1) - (4 * x_1 * x_1);
        double fn2 = 67 + (24 * x_2) - (4 * x_2 * x_2);

        System.out.println("starting values:");
        System.out.println("fn1 = " + fn1 + ", fn2 = " + fn2);
        System.out.println(" ");

        double lower_bound = x_1 - 1;
        double upper_bound = x_2 + 1;

        for (int j = 0; j < 100; j++){

            //need a better way of tracking the variables

            if (fn1 < fn2) {
                System.out.println("fn1 < fn2");

                lower_bound = x_1;
                x_1 = x_2;
                x_2 = lower_bound + (.618 * (upper_bound - lower_bound));
                fn1 = fn2;

                fn2 = 67 + (24 * x_2) - (4 * x_2 * x_2);

                System.out.println("fn1 = " + fn1 + ", fn2 = " + fn2 );

            } else {
                System.out.println("fn1 >= fn2");

                upper_bound = x_2;
                x_2 = x_1;
                x_1 = upper_bound - (.618 * (upper_bound - lower_bound));
                fn2 = fn1;
                fn1 = 67 + (24 * x_1) - (4 * x_2 * x_1);

                System.out.println("fn1 = " + fn1 + ", fn2 = " + fn2);

            }

            System.out.println("Range = " + Math.abs(x_2 - x_1));
            System.out.println("x_1 =" +  x_1 + ", x_2 = " + x_2 );
        }


        System.out.println("return");
        return 3;


    }














}
