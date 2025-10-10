package com.pratham.corejava.Java8Features;

public class LambdaFeature {
    public static void main(String[] args) {

        AForLambda aForLambda = () -> System.out.println("This is Lambda Expression");

        aForLambda.method();
    }
}
