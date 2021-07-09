package assignment1;

import java.util.Scanner;

public class problem5 {
    public static void main (String[] args)
    {
        int x;
        int p;
        int r = 0;
        int y = 1;
        int z = 1;
        int f = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        x = input.nextInt();

        p = x - 2;

        while (y <= x)
        {
            System.out.print(" * ");
            y++;
        }
        while (r < p)
        {
            System.out.print("\n * ");
            while (z <= p)
            {
                System.out.print("   ");
                z++;
            }
            System.out.print(" * ");
            r++;
            z=1;
        }
        System.out.print("\n");

        if  (x > 1)
        {
            while (f <= x)
            {
                System.out.print(" * ");
                f++;
            }
        }
        System.out.print("\n");
    }
}
