public class listNodeMerge {
    public static listNode mergeTwoLists(listNode list1, listNode list2) {
        listNode result = new listNode(-1);
        listNode p = result;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if (list1 == null) {
            p.next = list2;
        } else if (list2 == null) {
            p.next = list1;
        }
        return result.next;
    }

    static void printList(listNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        listNode head1 = new listNode(1);
        head1.next = new listNode(3);
        head1.next.next = new listNode(5);

        // 1->3->5 LinkedList created
        listNode head2 = new listNode(0);
        head2.next = new listNode(2);
        head2.next.next = new listNode(4);

        // 0->2->4 LinkedList created
        listNode mergedhead = mergeTwoLists(head1, head2);

        printList(mergedhead);
    }
}
/**
 * Definition for singly-linked list.
 * public class listNode {
 * int val;
 * listNode next;
 * listNode() {}
 * listNode(int val) { this.val = val; }
 * listNode(int val, listNode next) { this.val = val; this.next = next; }
 * }
 */
