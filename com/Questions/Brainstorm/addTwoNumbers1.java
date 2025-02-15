package com.Questions.Brainstorm;

public class addTwoNumbers1 {
    public listNode addTwoNumbers(listNode l1, listNode l2) {
        listNode dummy = new listNode();
        listNode current = dummy;
        int carry = 0; 
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new listNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(listNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println(); // New line after printing the list
    }

    public static void main(String[] args) {
        // Example: Creating the linked list 1 -> 2 -> 3
        listNode l1 = new listNode(4);
        l1.next = new listNode(5);
        l1.next.next = new listNode(2);

        // Creating the second linked list (representing the number 564 -> 4 -> 6 -> 5)
        listNode l2 = new listNode(4);
        l2.next = new listNode(6);
        l2.next.next = new listNode(5);

        // Adding the two numbers
        listNode result = new addTwoNumbers1().addTwoNumbers(l1, l2);
        // Printing the result (expected output: 7 -> 0 -> 8, since 243 + 564 = 807)
        System.out.print("Resultant linked list: ");

        printList(result);
    }
}
