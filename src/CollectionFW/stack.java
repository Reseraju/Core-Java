package CollectionFW;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        String str = "Welcome to java";
        Scanner sc = new Scanner(System.in);

       
        Stack<String> stack = new Stack<>();

        
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                stack.push(word);
                word = "";
            }
        }
        stack.push(word);

        System.out.println("stack is: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
