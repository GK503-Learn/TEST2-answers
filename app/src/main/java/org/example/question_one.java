package org.example;

import java.util.ArrayList;  
import java.util.function.Consumer; 
import java.util.function.Supplier;  
import java.util.function.Function;  
import java.util.function.Predicate; 

public class question_one {
    public static void main(String[] args) {
        Consumer<String> printString = (x) -> System.out.println(x);

        Supplier<Integer> getNumber = () -> 42;

        Function<Integer, Integer> doubleNumber = (x) -> x*2;

        Predicate<Integer> isEven = (x) -> x%2 == 0;

        System.out.println(doubleList([1, 2, 3], doubleNumber));
    }

    public ArrayList<Integer> doubleList(int[] arrInt, Function<Integer, Integer> funcInt) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int rInt : arrInt) {
            list.add(funcInt.apply(rInt));
        }
        return list;
    }
}