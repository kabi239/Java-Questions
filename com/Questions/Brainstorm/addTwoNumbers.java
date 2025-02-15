package com.Questions.Brainstorm;

// this code will work till integer value
public class addTwoNumbers {

    public static int listToIntReverse(listNode head) {
        int num = 0;
        int multiplier = 1;
        
        while (head != null) {
            num += head.val * multiplier;
            head = head.next;
            multiplier *= 10;
        }
        
        return num;
    }
    public static listNode numberToList(int num) {
        // Handle the case where num is 0
        if (num == 0) {
            return new listNode(0);
        }
        
        listNode head = null;
        listNode current = null;

        while (num > 0) {
            int digit = num % 10;  
            num /= 10; 
            
            listNode newNode = new listNode(digit); 
            
            if (head == null) {
                head = newNode; 
                current = head;  
            } else {
                current.next = newNode;  
                current = current.next; 
            }
        }

        return head;
    }
    public static listNode addTwoNumbers1(listNode l1, listNode l2) {
        int num1 = listToIntReverse(l1);
        int num2 = listToIntReverse(l2);
        return numberToList(num1+num2); 
    }
    public static void printList(listNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
     // Example: Creating the linked list 1 -> 2 -> 3
        listNode l1 = new listNode(3);
        l1.next = new listNode(4);
        l1.next.next = new listNode(2);
        
        // Creating the second linked list (representing the number 564 -> 4 -> 6 -> 5)
        listNode l2 = new listNode(4);
        l2.next = new listNode(6);
        l2.next.next = new listNode(5);
        
        // Adding the two numbers
        listNode result = addTwoNumbers1(l1,l2);
        
        // Printing the result (expected output: 7 -> 0 -> 8, since 243 + 564 = 807)
        System.out.print("Resultant linked list: ");
        printList(result);   
    }
}
