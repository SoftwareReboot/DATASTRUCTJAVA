import java.util.*;

public class Menu {

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. StackArray");
            System.out.println("2. StackNode");
            System.out.println("3. QueueArray");
            System.out.println("4. QueueNode");
            System.out.println("5. Infix to Postfix Conversion");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            
            switch (choice) {
                case 1:
                    handleStackArray(scanner);
                    break;
                case 2:
                    handleStackNode(scanner);
                    break;
                case 3:
                    handleQueueArray(scanner);
                    break;
                case 4:
                    handleQueueNode(scanner);
                    break;
                case 5:
                    handleInfixToPostfix(scanner);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void handleStackArray(Scanner scanner) {
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        StackArray stack = new StackArray(size);

        while (true) {
            System.out.println("StackArray Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Go back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    String value = scanner.nextLine();
                    if (!stack.push(value)) {
                        System.out.println("Stack is full!");
                    }
                    break;
                case 2:
                    if (!stack.pop()) {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 3:
                    String peekValue = stack.peek();
                    if (peekValue != null) {
                        System.out.println("Top element: " + peekValue);
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 4:
                    stack.displayDetails();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void handleStackNode(Scanner scanner) {
        StackList stack = new StackList();

        while (true) {
            System.out.println("StackNode Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Go back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    String value = scanner.nextLine();
                    stack.push(value);
                    break;
                case 2:
                    if (!stack.pop()) {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 3:
                    String peekValue = stack.peek();
                    if (peekValue != null) {
                        System.out.println("Top element: " + peekValue);
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void handleQueueArray(Scanner scanner) {
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        QueueArray queue = new QueueArray(size);

        while (true) {
            System.out.println("QueueArray Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Go back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    String value = scanner.nextLine();
                    if (!queue.enqueue(value)) {
                        System.out.println("Queue is full!");
                    }
                    break;
                case 2:
                    if (!queue.dequeue()) {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    Object front = queue.front();
                    if (front != null) {
                        System.out.println("Front element: " + front);
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void handleQueueNode(Scanner scanner) {
        QueueList queue = new QueueList();

        while (true) {
            System.out.println("QueueNode Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Go back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    String value = scanner.nextLine();
                    queue.enqueue(value);
                    break;
                case 2:
                    if (!queue.dequeue()) {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    String front = queue.front();
                    if (front != null) {
                        System.out.println("Front element: " + front);
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void handleInfixToPostfix(Scanner scanner) {
        System.out.print("Enter an infix expression: ");
        String infix = scanner.nextLine();
        InfixToPostfix converter = new InfixToPostfix(infix);
        String postfix = converter.convert();
        System.out.println("Postfix expression: " + postfix);
        
        Evaluate evaluator = new Evaluate(postfix);
        double result = evaluator.getResult();
        System.out.println("Result of evaluation: " + result);
    }
}
