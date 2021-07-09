package assignment1;

import java.util.Scanner;

public class problem4 {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        problem4 myC = new problem4();
        String[] EmployeeNames = {" ", " ", " "};
        int[] HoursWorked = {0, 0, 0};
        double hourlyRate;

        System.out.println("Welcome to the Salary Calculator.\n");
        System.out.println("Please enter:");

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Employee" + (i + 1) + " Name: ");
            EmployeeNames[i] = input.nextLine();
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.print(EmployeeNames[i] + "'s hours worked: ");
            HoursWorked[i] = input.nextInt();
        }

        System.out.print("and finally, how much all three made per hour: ");
        hourlyRate = input.nextDouble();
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("The gross pay for " + EmployeeNames[i] + " is: $%.2f",
                    myC.CalculationMethod(HoursWorked[i], hourlyRate));
            System.out.println();
        }
    }

    public double CalculationMethod(int numberOfHours, double hourlyRate)
    {
        double grossPay;
        if (numberOfHours <= 40)
        {
            grossPay = numberOfHours * hourlyRate;
        }
        else
        {
            System.out.printf("%S", "Overtime Time Notice: ");
            int HalfTime = numberOfHours / 2;
            grossPay = (numberOfHours + HalfTime) * hourlyRate;
        }
        return grossPay;
    }

}
