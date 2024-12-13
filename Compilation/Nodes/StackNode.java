package Compilation.Nodes;

import java.util.Scanner;

class StackNode {
    String data;
    StackNode tail;
    
    public StackNode(String data) {
        this.data = data;
        tail = null;
    }
}

class StackList {
    private StackNode head;
    private int count;
    
    public StackList() {
        head = null;
        count = 0;
    }
    
    private boolean isEmpty() {
        return count == 0;
    }
    
    public boolean push(String data) {
        StackNode node = new StackNode(data);
        
        node.tail = head;
        head = node;
        count++;
        return true;
    }
    
    public boolean pop() {
        if (!isEmpty()) {
            head = head.tail;
            count--;
            return true;
        }
        return false;
    }
    
    public String peek() {
        if (!isEmpty()) {
            return head.data;
        }
        return null;
    }
    
    public int getCount() {
        return count;
    }
    
    public void display() {
        if (!isEmpty()) {
            StackNode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.tail;
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty....");
        }
    }

    public static void exeSNMENU(Scanner scann) {
        StackList stack = new StackList();
        int choice;
        
        do {
            System.out.println("Stack Operations Menu:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek the top element");
            System.out.println("4. Display stack");
            System.out.println("5. Check if stack is empty");
            System.out.println("6. Get stack count");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scann.nextInt();
            scann.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    String data = scann.nextLine();
                    stack.push(data);
                    System.out.println(data + " pushed to stack.");
                    break;
                    
                case 2:
                    if (stack.pop()) {
                        System.out.println("Element popped from stack.");
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                    
                case 3:
                    String top = stack.peek();
                    if (top != null) {
                        System.out.println("Top element is: " + top);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                    
                case 4:
                    stack.display();
                    break;
                    
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                    
                case 6:
                    System.out.println("Stack count: " + stack.getCount());
                    break;
                    
                case 0:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 0);
        
        scann.close();
    }
}

