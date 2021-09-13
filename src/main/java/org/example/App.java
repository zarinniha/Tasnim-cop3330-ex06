/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;
import java.util.Calendar;

class retirement{

    public static void main(String args[])
    {
        System.out.print("What is you current age? ");
        Scanner sc = new Scanner(System.in);
        String num1= sc.nextLine();
        int age= Integer.parseInt(num1);

        System.out.print("At what age would you like to retire ");
        String num2= sc.nextLine();
        int retire= Integer.parseInt(num2);

        int years= retire-age;

        if(years>0)
        {
            System.out.println("you have "+ years + " years left until you can retire.");
            int currentyear = Calendar.getInstance().get(Calendar.YEAR);
            System.out.println("It's " + currentyear +", so you can retire in "+((currentyear+years)));

        }else
        {
            System.out.println("You can retire now.");
        }

    }
}
