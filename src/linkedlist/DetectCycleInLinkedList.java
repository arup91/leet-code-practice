package linkedlist;

import java.util.ArrayList;
import java.util.List;

import linkedlist.MyLinkedList.Node;

public class DetectCycleInLinkedList {
    public Node detectCycle(Node head) {
        List<Node> nodes = new ArrayList<>();
        while (head != null) {
            if (nodes.contains(head)) {
                return head;
            } else {
                nodes.add(head);
            }
            head = head.next;
        }
        return null;
    }

    public static void main(String args[]) {
        DetectCycleInLinkedList cycle = new DetectCycleInLinkedList();
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
        System.out.println(cycle.detectCycle(list.head));
    }
}
