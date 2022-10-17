package com.ailliushchenia.methodlink;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodLink {

    public int value;

    public MethodLink() {
    }
    public MethodLink(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        //Static method link example
        Consumer<Integer> printer = MethodLink::print;
        printer.accept(123);

        //Not static method link example
        Function<Integer, String> converter = new MethodLink()::converter;
        String strValue = converter.apply(456);
        System.out.println(strValue);

        //Not static method link any object example
        new MethodLink().notStaticMethodAnyObject();

        //Constructor link example
        Function<Integer, MethodLink> methodLinkCreator = MethodLink::new;
        MethodLink methodLink = methodLinkCreator.apply(555);
        System.out.println(methodLink.value);

    }
    public static void print(Integer value){
        System.out.println(value);
    }

    public String converter(Integer value){
        return String.valueOf(value);
    }

    public void notStaticMethodAnyObject(){
        Function<Integer, String> converter = this::converter;
        String strValue = converter.apply(789);
        System.out.println(strValue);
    }
}
