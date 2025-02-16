package com.Questions.Lintcode;
/* Question: 
 Create a Student class to represent a student object, 
now have the following requirements: have the following class attributes, 
name, age, list of grades [language, math, English], where the type of each class 
grade is an integer, the methods of the class are described as follows:

list item to get the name of the student. get_name(), which returns the following:
name:zhangming
Get the age of the student. get_age(), the return content is:
age:20
Return the highest score of the 3 subjects. get_course(), returns the following:
max_achievement:100 */
class Student{
    public int age;
    public String name;
    int [] scores = new int[3];
    Student(String name, int age, int [] scores){
        this.name = name;
        this.age = age;
        this.scores[0] = scores[0];
        this.scores[1] = scores[1];
        this.scores[2] = scores[2];

    }
    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    } 
    public int get_Maximum_Marks(){
        return Math.max(scores[0], Math.max(scores[1], scores[2]));
    }
}
public class printStudentInformation {

    public static void main(String[] args) {
        int [] scores = {90, 80, 70};
        Student s = new Student("John", 20, scores);
        System.out.println("Name: " + s.get_name());
        System.out.println("Age: " + s.get_age());
        System.out.println("Maximum Marks: " + s.get_Maximum_Marks());
    }
}
