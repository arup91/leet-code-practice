package linkedlist;

import linkedlist.MyLinkedList.Node;

public class LinkedListCycle {

    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slowNode = head;
        Node fastNode = head.next;
        while (slowNode != fastNode) {
            if (fastNode == null || fastNode.next == null) {
                return false;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return true;
    }

    public static void main(String args[]) {
        LinkedListCycle cycle = new LinkedListCycle();
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(-4);
        list.addAtHead(0);
        list.addAtHead(2);
        list.addAtHead(3);
        Node node = list.head;
        Node linkNode = null;
        int i = 0;
        while (node != null) {
            if (i == 1) {
                linkNode = node;
            }
            i++;
            if (node.next == null) {
                node.next = linkNode;
                break;
            }
            node = node.next;
        }
        System.out.println(cycle.hasCycle(list.head));
    }
}
