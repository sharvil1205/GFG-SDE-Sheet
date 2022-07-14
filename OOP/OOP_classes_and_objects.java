/*
 OOP: OOP revolves around creating objects that contain both data and methods, rather than functions and logic
 Classes: Class is a template for objects. Eg: Fruit
 Objects: Object is an instance of a class. Eg: banana, apple, mango etc
 */

import java.util.*;
public class OOP_classes_and_objects
{
    int x = 10;                                                                                  // attribute

    public static void main(String[] args) {
        OOP_classes_and_objects obj = new OOP_classes_and_objects();                            // creating an object named 'obj' for a class named 'OOP_classes_and_objects'
        System.out.println(obj.x);                                                              // accessing attribute x using an object of the class using dot(.)
    }
}