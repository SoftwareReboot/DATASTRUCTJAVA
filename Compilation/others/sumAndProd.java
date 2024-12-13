package Compilation.others;

import java.util.Scanner;

public class sumAndProd {
    public static void exeSumAndProd(Scanner scann) {
        Scanner scan = new Scanner (System.in);
        int input, sum = 0, prod = 1;
        
        System.out.print("Input 10 integer numbers: ");
        
        for(int i = 1; i <= 10; i++){
            input = scann.nextInt();
            
            if(input > 0){
                sum += input;
                prod *= input;
            }
        }
                System.out.print("The total sum is: " + sum);
                System.out.print("\nThe total product is: " + prod);
        scan.close();
    }

   
}