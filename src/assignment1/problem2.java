package assignment1;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a five digit number: ");
        num = input.nextInt();

        if( (num >= 10000) && (num <= 99999) )
        {
            System.out.printf("%d  ", (num /10000));
            System.out.printf("%d  ", (num /1000) % 10);
            System.out.printf("%d  ", (num /100) % 10);
            System.out.printf("%d  ", (num % 100) / 10);
            System.out.printf("%d  ", (num % 10));

        }
        if (num > 99999)
            System.out.println("You have entered a number more than five digits.");

        if (num < 10000)
            System.out.println("You have entered a number less than five digits.");

    }
}