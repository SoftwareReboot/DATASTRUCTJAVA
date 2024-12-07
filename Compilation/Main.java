import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to hold stackArray, StackList, and QueueArray instances
        stackArray stackArray = null;
        StackList stackList = null;
        QueueArray queue = null;
        
        // Menu loop
        while (true) {
            // Main menu
            System.out.println("\nChoose an option:");
            System.out.println("1. Use stackArray");
            System.out.println("2. Use StackList");
            System.out.println("3. Use QueueArray");
            System.out.println("4. Convert Infix to Postfix");
            System.out.println("5. Evaluate Postfix Expression");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:  // Use stackArray
                    System.out.print("Enter the size of the stack: ");
                    int size = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    stackArray = new stackArray(size);
                    stackArrayMenu(stackArray, scanner);
                    break;
                    
                case 2:  // Use StackList
                    stackList = new StackList();
                    stackListMenu(stackList, scanner);
                    break;
                    
                case 3:  // Use QueueArray
                    System.out.print("Enter the size of the queue: ");
                    size = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    queue = new QueueArray(size);
                    queueMenu(queue, scanner);
                    break;

                case 4:  // Convert Infix to Postfix
                    System.out.print("Enter an infix expression: ");
                    String infix = scanner.nextLine();
                    InfixToPostfix infixToPostfix = new InfixToPostfix(infix);
                    String postfix = infixToPostfix.convert();
                    System.out.println("Postfix expression: " + postfix);
                    break;

                case 5:  // Evaluate Postfix Expression
                    System.out.print("Enter a postfix expression: ");
                    String postfixExpression = scanner.nextLine();
                    Evaluate evaluator = new Evaluate(postfixExpression);
                    double result = evaluator.getResult();
                    System.out.println("The result of the postfix expression is: " + result);
                    break;
                    
                case 6:  // Exit
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Menu for stackArray operations
    private static void stackArrayMenu(stackArray stackArray, Scanner scanner) {
        while (true) {
            System.out.println("\nStackArray Operations:");
            System.out.println("1. Push an element onto the stack");
            System.out.println("2. Pop an element from the stack");
            System.out.println("3. Peek at the top element of the stack");
            System.out.println("4. Display the stack");
            System.out.println("5. Go back to the main menu");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:  // Push element
                    System.out.print("Enter the element to push: ");
                    String element = scanner.nextLine();
                    if (stackArray.push(element)) {
                        System.out.println("Element pushed.");
                    } else {
                        System.out.println("Stack is full. Cannot push.");
                    }
                    break;
                    
                case 2:  // Pop element
                    if (stackArray.pop()) {
                        System.out.println("Element popped.");
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                    
                case 3:  // Peek
                    String top = stackArray.peek();
                    if (top != null) {
                        System.out.println("Top element: " + top);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 4:  // Display stack
                    System.out.println("Stack contents:");
                    stackArray.displayDetails();
                    break;

                case 5:  // Go back to the main menu
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Menu for StackList operations
    private static void stackListMenu(StackList stackList, Scanner scanner) {
        while (true) {
            System.out.println("\nStackList Operations:");
            System.out.println("1. Push an element onto the stack");
            System.out.println("2. Pop an element from the stack");
            System.out.println("3. Peek at the top element of the stack");
            System.out.println("4. Display the stack");
            System.out.println("5. Go back to the main menu");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:  // Push element
                    System.out.print("Enter the element to push: ");
                    String element = scanner.nextLine();
                    stackList.push(element);
                    System.out.println("Element pushed.");
                    break;
                    
                case 2:  // Pop element
                    String popped = stackList.pop();
                    if (popped != null) {
                        System.out.println("Popped element: " + popped);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                    
                case 3:  // Peek
                    String top = stackList.peek();
                    if (top != null) {
                        System.out.println("Top element: " + top);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 4:  // Display stack
                    System.out.println("Stack contents:");
                    stackList.display();
                    break;

                case 5:  // Go back to the main menu
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Menu for QueueArray operations
    private static void queueMenu(QueueArray queue, Scanner scanner) {
        while (true) {
            System.out.println("\nQueueArray Operations:");
            System.out.println("1. Enqueue an element");
            System.out.println("2. Dequeue an element");
            System.out.println("3. Display the queue");
            System.out.println("4. Go back to the main menu");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:  // Enqueue element
                    System.out.print("Enter the element to enqueue: ");
                    String element = scanner.nextLine();
                    if (queue.enqueue(element)) {
                        System.out.println("Element enqueued.");
                    } else {
                        System.out.println("Queue is full. Cannot enqueue.");
                    }
                    break;
                    
                case 2:  // Dequeue element
                    if (queue.dequeue()) {
                        System.out.println("Element dequeued.");
                    } else {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    }
                    break;
                    
                case 3:  // Display queue
                    System.out.println("Queue contents:");
                    queue.display();
                    break;

                case 4:  // Go back to the main menu
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
