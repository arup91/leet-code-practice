package linkedlist;

import linkedlist.MyLinkedList.Node;

public class RemoveNthNode {
    public Node removeNthFromEnd(Node head, int n) {
        MyLinkedList list = new MyLinkedList();
        Node dummy = list.getNode(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String args[]) {
        RemoveNthNode cycle = new RemoveNthNode();
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(2);
        list.addAtHead(1);
        list.printLinkedList(cycle.removeNthFromEnd(list.head, 2));
    }
}
