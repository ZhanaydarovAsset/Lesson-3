package org.example;

public class Calculator {

    public static <T extends Number, K extends Number> Number summ(T t, K k){
        return t.doubleValue() + k.doubleValue();
    }
    public static <T extends Number, K extends Number> Number subtract(T t, K k){
        return t.doubleValue() - k.doubleValue();
    }
    public static <T extends Number, K extends Number> Number multiply(T t, K k){
        return t.doubleValue() * k.doubleValue();
    }
    public static <T extends Number, K extends Number> Number divide(T t, K k){
        if(k.doubleValue() == 0){
            throw new ArithmeticException("Division by zero.");
        }
        return t.doubleValue() / k.doubleValue();
    }
}
