package linkedlist;

import java.util.Arrays;
import java.util.List;

class MyLinkedList {
    Node head;
    int size = 0;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    
    public Node getNode(int val) {
        return new Node(val);
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (head == null || index >= size) {
            return -1;
        }
        int i = 0;
        Node node = head;
        while (node != null) {
            if (i > index) {
                return -1;
            }
            if (i == index) {
                return node.val;
            }
            node = node.next;
            i++;
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
        printLinkedList(head);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = head;
        if (node == null) {
            addAtHead(val);
            return;
        }
        while (node.next != null) {
            node = node.next;
        }
        Node newNode = new Node(val);
        node.next = newNode;
        size++;
        printLinkedList(head);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        int i = 0;
        if (index > size) {
            printLinkedList(head);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            this.addAtHead(val);
        } else {
            Node node = this.head;
            while (node != null) {
                if (i == index - 1) {
                    Node n = node.next;
                    node.next = newNode;
                    newNode.next = n;
                    size++;
                    break;
                }
                node = node.next;
                i++;
            }
        }
        printLinkedList(head);
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int i = 0;
        if (index >= size) {
            printLinkedList(head);
            return;
        }
        if (this.head == null) {
            return;
        }
        if (index == 0 && (this.head != null && this.head.next == null)) {
            this.head = null;
        } else {
            Node node = this.head;
            while (node != null) {
                if (index == 0 && i == index) {
                    head = node.next;
                    size--;
                    break;
                }
                if (i == index - 1) {
                    node.next = node.next.next;
                    size--;
                    break;
                }
                node = node.next;
                i++;
            }
        }
        printLinkedList(head);
    }

    public void printLinkedList(Node head) {
        if (head == null) {
            System.out.println(-1);
            return;
        }
        Node node = head;
        while (node.next != null) {
            System.out.print(node.val + " --> ");
            node = node.next;
        }
        System.out.println(node.val);

    }

    public static void main(String args[]) {
        String str = "addAtHead,addAtTail,addAtTail,addAtTail,addAtTail,addAtTail,addAtTail,deleteAtIndex,addAtHead,addAtHead,get,addAtTail,addAtHead,get,addAtTail,addAtIndex,addAtTail,addAtHead,addAtHead,addAtHead,get,addAtIndex,addAtHead,get,addAtHead,deleteAtIndex,addAtHead,addAtTail,addAtTail,addAtIndex,addAtTail,addAtHead,get,addAtTail,deleteAtIndex,addAtIndex,deleteAtIndex,addAtHead,addAtTail,addAtHead,addAtHead,addAtTail,addAtTail,get,get,addAtHead,addAtTail,addAtTail,addAtTail,addAtIndex,get,addAtHead,addAtIndex,addAtHead,addAtTail,addAtTail,addAtIndex,deleteAtIndex,addAtIndex,addAtHead,addAtHead,deleteAtIndex,addAtTail,deleteAtIndex,addAtIndex,addAtTail,addAtHead,get,addAtIndex,addAtTail,addAtHead,addAtHead,addAtHead,addAtHead,addAtHead,addAtHead,deleteAtIndex,get,get,addAtHead,get,addAtTail,addAtTail,addAtIndex,addAtIndex,addAtHead,addAtTail,addAtTail,get,addAtIndex,addAtHead,deleteAtIndex,addAtTail,get,addAtHead,get,addAtHead,deleteAtIndex,get,addAtTail,addAtTail";
        List<String> operations = Arrays.asList(str.split(","));
        // operations.forEach(System.out::println);
        String input = "[38],[66],[61],[76],[26],[37],[8],[5],[4],[45],[4],[85],[37],[5],[93],[10,23],[21],[52],[15],[47],[12],[6,24],[64],[4],[31],[6],[40],[17],[15],[19,2],[11],[86],[17],[55],[15],[14,95],[22],[66],[95],[8],[47],[23],[39],[30],[27],[0],[99],[45],[4],[9,11],[6],[81],[18,32],[20],[13],[42],[37,91],[36],[10,37],[96],[57],[20],[89],[18],[41,5],[23],[75],[7],[25,51],[48],[46],[29],[85],[82],[6],[38],[14],[1],[12],[42],[42],[83],[13],[14,20],[17,34],[36],[58],[2],[38],[33,59],[37],[15],[64],[56],[0],[40],[92],[63],[35],[62],[32]";
        input = input.replace("[", "");
        List<String> inputs = Arrays.asList(input.split("],"));
        MyLinkedList linkedList = new MyLinkedList();
        for (int i = 0; i < operations.size(); i++) {
            String operation = operations.get(i);
            switch (operation) {
            case "addAtHead":
                System.out.println("Add at head - " + inputs.get(i));
                linkedList.addAtHead(Integer.parseInt(inputs.get(i).replace("]", "")));
                break;
            case "addAtTail":
                System.out.println("Add at tail - " + inputs.get(i));
                linkedList.addAtTail(Integer.parseInt(inputs.get(i).replace("]", "")));
                break;
            case "deleteAtIndex":
                System.out.println("Delete at index - " + inputs.get(i));
                linkedList.deleteAtIndex(Integer.parseInt(inputs.get(i).replace("]", "")));
                break;
            case "get":
                System.out.println("Get - " + inputs.get(i));
                System.out.println(linkedList.get(Integer.parseInt(inputs.get(i).replace("]", ""))));
                break;
            case "addAtIndex":
                System.out.println("Add At Index - " + inputs.get(i));
                List<String> stri = Arrays.asList(inputs.get(i).replace("]", "").split(","));
                linkedList.addAtIndex(Integer.parseInt(stri.get(0)), Integer.parseInt(stri.get(1)));
                break;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 * 
 */