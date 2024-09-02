import java.util.Scanner;
import java.util.*;

class ListNode {
    char val;
    ListNode next;

    ListNode(char x) {
        val = x;
        next = null;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check if it's a palindrome: ");
        String inputString = scanner.nextLine();

        ListNode head = createLinkedList(inputString.toCharArray());

        boolean isPalindrome = isPalindromeLinkedList(head);

        if (isPalindrome)
            System.out.println("The linked list string is a palindrome.");
        else
            System.out.println("The linked list string is not a palindrome.");
    }

    public static ListNode createLinkedList(char[] chars) {
        ListNode dummy = new ListNode('0');
        ListNode current = dummy;

        for (char ch : chars) {
            current.next = new ListNode(ch);
            current = current.next;
        }

        return dummy.next;
    }

    public static boolean isPalindromeLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfStart = reverse(slow.next);
        ListNode firstHalfStart = head;

        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }}

    // class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
       
    }
}

class Main {
    Node head = null;
    int size = 0;

    void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;

        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
        size++;
    }

    boolean palindrome(Node h) {
        int mid = (size % 2 == 0) ? size / 2 : (size + 1) / 2;
        Node current = h;
        for (int i = 1; i < mid; i++) {
            current = current.next;

        }
        Node revHead = reverse(current.next);
        while (h != null && revHead != null) {
            if (h.data != revHead.data) {
                return false;
            }
            h = h.next;
            revHead = revHead.next;
        }
        return true;
    }

    Node reverse(Node h) {
        Node current = h;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Main m = new Main();
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sarr[] = s.split("\\s+ ");
        for (int i = 0; i < sarr.length; i++) {
            m.add(Integer.parseInt(sarr[i]));
        }
        System.out.println(m.palindrome(m.head));
    }
}
