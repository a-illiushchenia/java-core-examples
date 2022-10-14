package com.ailliushchenia.sreams;

import java.util.ArrayList;
import java.util.List;

public class MainStreams {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(List.of(5, -7, 10, 55, -86, 0, -7, 55));
        System.out.println("Is <0 present?");
        System.out.println(testList.stream().anyMatch(x -> x < 0));
        System.out.println("Print > 0");
        testList.stream().filter(x -> x > 0).forEach(x -> System.out.println(x));
        System.out.println("Print distinct");
        testList.stream().distinct().forEach(x -> System.out.println(x));

    }
}
