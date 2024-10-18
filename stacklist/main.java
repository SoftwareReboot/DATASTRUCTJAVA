package stacklist;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String choice = "";

        System.out.println(" Enter size: ");
        int size = scann.nextInt();
        stackArrayprac sap = new stackArrayprac(size);
        scann.nextLine();

        do{
            System.out.println("------Welcome to  Student Stack Menu---------------------------");
            System.out.println(" Press [1] to push");
            System.out.println(" Press [2] to pop");
            System.out.println(" Press [3] to peek");
            System.out.println(" Press [4] to display stack");
            System.out.println(" Press [5] to Exit");
            System.out.println("----------------------------------------------------------");

            System.out.println(" Enter your Choice: ");
            choice = scann.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println(" Enter Student name to be added to the Class list:  ");
                        String val = scann.nextLine();
                            if (sap.push(val)) {
                                System.out.println("[" + val + "]" + " Successfully added to Stack.");
                            }else{
                                System.out.println(" Error, Exceded Class list Limit ! ");
                            }
                        break;
                    case "2":
                            if (sap.pop()) {
                                System.out.println(" Successfully removed from Stack");
                            }else{
                                System.out.println(" Error, Class list is Empty! ");
                            }
                        break;
                    case "3":
                            String top = sap.peek();
                            if (top != null) {
                                System.out.println(" Top of Class List: " + "[" + top + "]");
                            }else{
                                System.out.println(" Error Class list is Empty");
                            }
                        break;
                    case "4":
                            sap.displayDetails();
                            break;
                    case "5":
                            System.out.println(" Successfully Exited the Program.");
                    default:
                            System.out.println(" Invalid Choice Please Try Again.");
                            break;
                }
   
        }while(!choice.equals("5"));
       
    }    
}
