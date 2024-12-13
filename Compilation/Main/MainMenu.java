package Compilation.Main;

import Compilation.others.*;
import Compilation.Arrays.*;
import Compilation.InfixToPostFix.*;
import Compilation.List.*;
import Compilation.Nodes.*;
import java.util.*;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
       String choice = "";

        do {
            System.out.println("\n\t|---------Compilation Main Menu---------|");
            System.out.println("\t|\t[0] Sum and Product Program.\t|");
            System.out.println("\t|\t[1] Odd and Even Program.\t|");
            System.out.println("\t|\t[2] Largest to Smallest Program.|");
            System.out.println("\t|\t[3] No Duplicate Program.\t|");
            System.out.println("\t|\t[4] Stack Array Program.\t|");
            System.out.println("\t|\t[5] Queue Array Program.\t|");
            System.out.println("\t|\t[6] StackList Program.\t\t|");
            System.out.println("\t|\t[7] NodeList Program.\t\t|");
            System.out.println("\t|\t[8] Infix To PostFix Program.\t|");
            System.out.println("\t|\t[9] Queue Node Program.\t\t|");
            System.out.println("\t|\t[x] Exit the Program.\t\t|");
            System.out.println("\t|---------------------------------------|");
            System.out.print("\tSelect which program you want to use : ");
            choice = scann.nextLine();
            System.out.println();
        

                switch (choice) {
                    case "0":
                        System.out.println("Sum and Product Program selected. \n");
                        sumAndProd.exeSumAndProd(scann);
                        break;
                    case "1":
                        System.out.println("Odd and Even Program selected. \n");
                        SecondActivity.exeOddEven(scann);   
                        break;
                    case "2":
                        System.out.println("Largest To Smallest Program selected. \n");
                        LargestToSmallest.exeLargeToSmall(scann);
                        break;
                    case "3":
                        System.out.println("No Duplicate Program selected. \n");
                        noDuplicate.exeNoDuplicate(scann);
                        break;
                    case "4":
                        System.out.println("Stack Array Program selected. \n");
                        StackArray.exeStackArray(scann);
                        break;
                    case "5":
                        System.out.println("Queue Array Program selected. \n");
                        QueueArray.exeQueueMenu(scann);
                        break;
                    case "6":
                        System.out.println("StackList Program selected. \n");
                        StackList.exeStackList(scann);
                        break;
                    case "7":
                        System.out.println(" NodeList Program selected \n");
                        NodeList.exeNodeList(scann);
                        break;
                    case "8":
                        System.out.println(" Infix To PostFix Program selected \n");
                        infixtopostfix.exeMenuInfixToPostfix(scann);
                        break;
                    case "9":
                        System.out.println(" Queue Node Program selected \n");
                        QueueNode.exeQnMenu(scann);
                        break;
                    case "x":
                        System.out.println(" Exiting Program....");
                        break;
                    default:
                        System.out.println(" Invalid Choice Please Try Again");
                        break;
                }
        } while (!choice.equals("x"));
       
    }
}    

    