package linkedlist;

import java.util.ArrayList;
import java.util.List;

import linkedlist.MyLinkedList.Node;

public class IntersectionOfList {

    public Node getIntersectionNode(Node headA, Node headB) {
        List<Node> nodes = new ArrayList<>();
        while (headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (nodes.contains(headB)) {
                return headB;
            } else {
                nodes.add(headB);
            }
            headB = headB.next;
        }
        return null;
    }
}
