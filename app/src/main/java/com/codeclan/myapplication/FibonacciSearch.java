package com.codeclan.myapplication;


import static java.lang.Math.*;

public class FibonacciSearch {

    private double angle;
    private double sin_theta;
    private double angle_in_radians;
    private int upper_limit = 180;
    private int lower_limit = 0;


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

    public void listValuesOfSin(){
        for (int i = lower_limit; i < upper_limit; i++){
            double a = i;
            double radians = Math.toRadians(a);
            System.out.println("Sine of angle " + i + " = " + Math.sin(radians));
            }
    }

    public int fibMinusOne(int fib){
        int fibMinusOne = 8;
        return fibMinusOne;
    }


    public double findMaximumByFibonacciSearch(int Fn){
        double s = (upper_limit - lower_limit)/Fn;
        double x_2 = lower_limit + (s * fibMinusOne(Fn));





        return v;


    }



}
