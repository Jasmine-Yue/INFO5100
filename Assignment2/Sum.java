package com.company;

public class Sum {
    public double add(double ... a)
    {
        double result=0;
        for(double i: a)
             result+=i;
        return  result;
    }
}
