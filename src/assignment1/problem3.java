package assignment1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,num4,num5;
        int totalPos=0,totalNeg=0,totalZero=0;
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        num3 = input.nextInt();
        System.out.print("Enter fourth integer: ");
        num4 = input.nextInt();
        System.out.print("Enter fifth integer: ");
        num5 = input.nextInt();

        if (num1 < 0)
            totalNeg = totalNeg + 1;
        if (num2 < 0)
            totalNeg = totalNeg + 1;
        if (num3 < 0)
            totalNeg = totalNeg + 1;
        if (num4 < 0)
            totalNeg = totalNeg + 1;
        if (num5 < 0)
            totalNeg = totalNeg + 1;


        if (num1 > 0)
            totalPos = totalPos + 1;
        if (num2 > 0)
            totalPos = totalPos + 1;
        if (num3 > 0)
            totalPos = totalPos + 1;
        if (num4 > 0)
            totalPos = totalPos + 1;
        if (num5 > 0)
            totalPos = totalPos + 1;

        if (num1 == 0)
            totalZero = totalZero + 1;
        if (num2 == 0)
            totalZero = totalZero + 1;
        if (num3 == 0)
            totalZero = totalZero + 1;
        if (num4 == 0)
            totalZero = totalZero + 1;
        if (num5 == 0)
            totalZero = totalZero + 1;
        System.out.println();
        System.out.printf("Total negative numbers: %d\n",totalNeg);
        System.out.printf("Total positive numbers: %d\n",totalPos);
        System.out.printf("Total zero numbers: %d\n",totalZero);




    }
}
