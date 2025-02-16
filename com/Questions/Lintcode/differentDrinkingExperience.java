package com.Questions.Lintcode;
/*
    3332 · Different Drinking Experience
    Description
    Description
        In this problem, we defined the Drinks interface, what you need 
        to do is to implement the Drinks interface for both the Water 
        class and the Milk class, and implement the drinkingFeeling() 
        and getName() methods. You can review other readable files to 
        determine the overall judge logic.

 */
interface Drinks {
    String getName();
    String drinkingFeeling();
}
class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public void drink(Drinks drink) {
        System.out.println(name + " is drinking " + drink.getName());
        System.out.println(name + " feels " + drink.drinkingFeeling());
    }
}
class Milk implements Drinks {
    
    @Override
    public String getName() {
        return "Milk";
    }
    @Override
    public String drinkingFeeling() {
        return "very sweet";
    }

    
}
class Water implements Drinks {

    // write your code here

    @Override
    public String drinkingFeeling() {
        return "nothing special";
    }

    @Override
    public String getName() {
        return "Water";
    }
}
public class differentDrinkingExperience {
    public static void main(String[] args) {
        Person p = new Person("Tom");
        Drinks drink= new Milk();
        p.drink(drink);
        drink = new Water();
        p.drink(drink);
    }
}
