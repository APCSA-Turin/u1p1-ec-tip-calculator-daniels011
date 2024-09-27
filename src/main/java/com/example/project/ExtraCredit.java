package com.example.project;
import java.util.Scanner;

public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();              
        result.append("-------------------------------\n");
        result.append(String.format("Total bill before tip: $%.2f\n", cost));
        result.append("Total percentage: " + percent + "%\n");
        
        double tip = cost * (percent / 100.0);
        tip = Math.round(tip * 100) / 100.0;
        result.append(String.format("Total tip: $%.2f\n", tip));
        
        double totalBillWithTip = cost + tip;
        result.append(String.format("Total Bill with tip: $%.2f\n", totalBillWithTip));
        
        double personCostNoTip = cost / people;
        personCostNoTip = Math.round(personCostNoTip * 100) / 100.0;
        result.append(String.format("Per person cost before tip: $%.2f\n", personCostNoTip));
        
        double tipPerPerson = tip / people;
        tipPerPerson = Math.round(tipPerPerson * 100) / 100.0;
        result.append(String.format("Tip per person: $%.2f\n", tipPerPerson));
        
        double totalPerPerson = totalBillWithTip / people;
        totalPerPerson = Math.round(totalPerPerson * 100) / 100.0;
        result.append(String.format("Total cost per person: $%.2f\n", totalPerPerson));
        
        result.append("-------------------------------\n");
        result.append("Items ordered:\n");
        result.append(items);
        
        return result.toString();
    }
                                   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String character = "a";
        int people;
        int percent;
        double cost;
        String items;

        System.out.print("Enter the number of people: ");
        people = scan.nextInt();

        System.out.print("Enter the percentage tip: ");
        percent = scan.nextInt();

        System.out.print("Enter the total cost: ");
        cost = scan.nextDouble();

        scan.nextLine(); // Consume newline
        System.out.print("Enter the items ordered: ");
        items = scan.nextLine();
        
        while (!character.equals("x")) {
            System.out.print("Thanks for not entering ‘x’. Enter another letter: ");
            character = scan.next();
        }

        System.out.println("You entered ‘x’ :(");
        System.out.println(calculateTip(people, percent, cost, items));
    }
}
