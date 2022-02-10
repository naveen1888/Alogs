package com.company;

public class Linked {

    private Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // front of list add
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //add after a given node
    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void printList() {
        Linked.Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    // add node at last
    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }

        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public void deleteNode(int pos) {
        //if linked list is empty
        if (head == null) {
            System.out.println("Error linked list is empty");
            return;
        }
        Node temp = head;
        // if head need to be deleted
        if (pos == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        //if pos is more than no of node
        if (temp == null || temp.next == null) {
            System.out.println("Position cannot be more than no of node");
            return;
        }
        temp.next = temp.next.next;
    }

    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }

    public int getNth(int index) {
        Node current = head;
        int count = 0; /* index of Node we are  currently looking at */
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        assert (false);
        return 0;
    }

    public static void printRevers(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.push(1);
        //linked.append(11);
        linked.push(2);
        linked.push(3);
        /*
        linked.append(33);
        linked.insertAfter(linked.head, 4);
        linked.push(5);
        linked.deleteNode(0);
        */
        System.out.println( "Element is at index: " + linked.getNth(2));
        if (linked.search(linked.head, 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        linked.printList();
        System.out.println("");
        linked.head = reverse(linked.head);

        printRevers(linked.head);
    }
}
