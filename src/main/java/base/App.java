/*
 *  UCF COP3330 Summer 2021 Exercise 21 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int monthNum = myApp.readMonthNum();
        String month = myApp.numToMonth(monthNum);
        myApp.displayOutput(month);
    }

    private int readMonthNum() {
        System.out.print("Please enter the number of the month: ");
        return Integer.parseInt(in.nextLine());
    }

    public String numToMonth(int monthNum) {
        switch(monthNum) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IndexOutOfBoundsException("Month number must be between 1-12, inclusive");
        }
    }

    public void displayOutput(String month) {
        System.out.printf("The name of the month is %s.%n", month);
    }
}
