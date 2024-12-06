package QueueNode;

import java.util.*;
/*This Program is Created By: Joshua Miguel G. Jamisola
 * BSCS 2A
 * CC-DASTRUC21LEC-08706
 * 11/9/2024
 */
public class main {
    public static void main(String[] args) {
        QueueNode qn = new QueueNode();
        Scanner scann = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("------Welcome to Queue Menu---------------------------");
            System.out.println(" Press [1] to Enqueue");
            System.out.println(" Press [2] to Dequeue");
            System.out.println(" Press [3] to Display Front Of Queue");
            System.out.println(" Press [4] to Display Last Of Queue");
            System.out.println(" Press [5] to Display Queue");
            System.out.println(" Press [6] to Exit");
            System.out.println("----------------------------------------------------------");
            
            System.out.print(" Enter your Choice: ");
            choice = scann.nextInt();
            scann.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the value to Enqueue: ");
                        String value = scann.nextLine();
                        qn.Enqueue(value);
                        System.out.println("Enqueued: " + value);
                        System.out.println();
                        break;
                    case 2:
                        if (qn.Dequeue()) {
                            System.out.println(" Dequeued Successfully");
                        }else{
                            System.out.println(" Queue is Empty. Cannot Dequeue");
                        }
                        break;
                    case 3:
                        System.out.println(" First in Queue: " + qn.getFirst());
                        break;
                    case 4:
                        System.out.println(" Last in Queue: " + qn.getLast());
                        break;
                    case 5:
                        System.out.println(" Current Queue: ");
                        qn.display();
                        break;
                    case 6:
                        System.out.println(" Exiting...");
                        break;
                    default:
                        System.out.println(" Invalid Choice. Please try again");
                        break;
                    }
        } while (choice != 6);
    }    
}
