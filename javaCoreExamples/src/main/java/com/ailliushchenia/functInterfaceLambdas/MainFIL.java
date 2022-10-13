package com.ailliushchenia.functInterfaceLambdas;

import com.ailliushchenia.functInterfaceLambdas.customFuncInterfases.ConsoleLogger;
import com.ailliushchenia.functInterfaceLambdas.customFuncInterfases.PriceChanger;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainFIL {
    public static void main(String[] args) {
        showCustomFuncInterfaces();
        System.out.println();
        showCoreFuncInterfaces();

    }

    private static void showCustomFuncInterfaces() {
        System.out.println("--- CUSTOMFUNCTINTERFACES ---");
        System.out.println("--- ConsoleLogger ---");
        ConsoleLogger consoleLogger;
        consoleLogger = x -> System.out.println("LOG:" + x.toString());

        String strValue = "Hello, World!";
        int intValue = 99;
        consoleLogger.log(strValue);
        consoleLogger.log(intValue);
        System.out.println();

        System.out.println("--- PriceChanger ---");
        PriceChanger<Float, Integer> priceChanger = (p, dp) -> p - p * dp / 100;
        float priceMilk = 2.3f;
        int discountPercentage = 12;
        System.out.println(priceChanger.changePrice(priceMilk, discountPercentage));
    }

    private static void showCoreFuncInterfaces() {
        System.out.println("--- COREFUNCTINTERFACES ---");
        System.out.println("--- Predicate ---");
        Predicate<Integer> isPositiveOrZero = x -> (x >= 0);
        System.out.println(isPositiveOrZero.test(-3));
        System.out.println(isPositiveOrZero.test(10));

        System.out.println("--- Function ---");
        Function<String, Integer> strToInt = x -> Integer.valueOf(x);
        int result = strToInt.apply("10");
        System.out.println(result + 5);

    }
}
