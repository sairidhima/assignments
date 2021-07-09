package assignment1;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a 5-digit integer: ");
        String n=s.nextLine();
        if(n.length()!=5)
        {
            System.out.println("Number is not five digits long.");
            return ;
        }
        for(int i=0;i<2;i++)
            if(n.charAt(i)!=n.charAt(4-i))
            {
                System.out.println("Not a palindrome");
                return;
            }
        System.out.println("Palindrome");

    }
}
