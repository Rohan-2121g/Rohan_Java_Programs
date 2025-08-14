package com.rohan;

import java.util.ArrayList;
import java.util.List;

public class Wrapper_example_medium_one {
    public static void main(String[] args) {
        
        // 🔹 Primitive data type
        int a = 10;

        // 🔹 Autoboxing: Java automatically converts primitive 'int' to wrapper 'Integer'
        Integer obj = a; // Equivalent to: Integer obj = Integer.valueOf(a);

        // 🔹 Unboxing: Java automatically converts wrapper 'Integer' back to primitive 'int'
        int b = obj; // Equivalent to: int b = obj.intValue();

        // 🔹 Displaying values to show conversion results
        System.out.println("Original primitive: " + a); // Outputs: 10
        System.out.println("Boxed object: " + obj);     // Outputs: 10 (as Integer)
        System.out.println("Unboxed value: " + b);      // Outputs: 10

        // 🔹 Creating a list to store Integer objects (wrapper class)
        List<Integer> numbers = new ArrayList<>();

        // 🔹 Adding primitive values to the list — autoboxing happens here
        numbers.add(15); // int → Integer
        numbers.add(25);
        numbers.add(35);

        // 🔹 Calculating the sum of all elements in the list
        int sum = 0;
        for (Integer num : numbers) {
            // 🔹 Unboxing: each Integer is converted to int during addition
            sum += num;
        }

        // 🔹 Displaying the sum of list elements
        System.out.println("Sum of list elements: " + sum); // Outputs: 75

        // 🔹 Using a static method from the Integer wrapper class to find the max of two values
        System.out.println("Max value using wrapper method: " + Integer.max(numbers.get(0), numbers.get(2)));
        // Outputs: 35 (max of 15 and 35)
    }
}


//🧠 What Is a Wrapper Class in Java?
//[A wrapper class in Java is used to convert primitive data types|
//|(like int, char, double, etc.) into objects. This is useful when| 
//|working with collections, generics, or any API that requires| 
//|objects rather than primitives.](these 4 lines are of definition of wrapper class)



//💡 Key Concepts Demonstrated
//- Autoboxing: int → Integer automatically
//- Unboxing: Integer → int automatically
//- Wrapper methods: like Integer.max()
//- Collections: storing wrapper objects in a List















