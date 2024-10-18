package stacklist;

import java.util.*;

public class stackArrayprac {
    private String[] s;
    private int counter;
    
    public stackArrayprac(int size){
        s = new String[size];
        counter = 0;
    }

    public stackArrayprac(){
        this(0);
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public boolean isFull(){
        return counter == s.length;
    }

    public boolean push(String value){
        if (!isFull()) {
            s[counter ++] = value;
            return true;
        }
            return false;
    }

    public boolean pop(){
        if (!isEmpty()) {
            s[counter - 1] = null;
            counter --;
            return true;
        }
            return false;
    }

    public String peek(){
        if (!isEmpty()) {
            return s[counter - 1];
        }
            return null;
    }

    public void displayDetails(){
        if (!isEmpty()) {
            for(int i = counter -1; i >= 0; i--){
                System.out.println("[" + s[i] + "]");
            }
        }else{
            System.out.println(" Error, Stack is Empty.");
        }
    }
}
