package com.Questions.Lintcode;
/*
    3426 · Output of The Number of Objects
    Description
Implement the corresponding functions as required by the school, with the following requirements.

1)create a school member class SchoolMember with the name and number of members.
2)create a teacher class Teacher that inherits the school member class and has the salary property.
3)create a student class Student that inherits the school member class and has the grade property
4)When creating teacher and student objects, add 1 to the total number; if the object is reduced, subtract 1 from the total number
Refine the corresponding classes so that the corresponding content can be output.
 */

class SchoolMember {
    public static int totalMembers = 0;
    public String name;

    public SchoolMember(String name) {
        this.name = name;
        totalMembers++;
    }

    public void delete() {
        totalMembers--;
    }
}

class Teacher extends SchoolMember {
    public int salary;

    public Teacher(String name, int salary) {
        super(name);
        this.salary = salary;
    }
}

class Students extends SchoolMember {
    public int grade;

    public Students(String name, int grade) {
        super(name);
        this.grade = grade;
    }
}

public class outputOfTheNumberOfObjects {

    public static void main(String[] args) {
        System.out.println("Add opperations: ");
        Teacher t1 = new Teacher("John", 2000);
        System.out.println("Total Members: " + SchoolMember.totalMembers);
        Teacher t2 = new Teacher("Alice", 3000);
        System.out.println("Total Members: " + SchoolMember.totalMembers);
        Students s1 = new Students("Alice", 90);
        System.out.println("Total Members: " + SchoolMember.totalMembers);
        Students s2 = new Students("Bob", 80);
        System.out.println("Total Members: " + SchoolMember.totalMembers);
        System.out.println("Delete opperations: ");
        t1.delete();
        System.out.println("Total Members: " + SchoolMember.totalMembers);
        t2.delete();
        System.out.println("Total Members: " + SchoolMember.totalMembers);
    }
}
