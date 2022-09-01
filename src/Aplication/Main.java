package Aplication;

import Entities.Company;
import Entities.Person;
import Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();


        System.out.println("Enter the number of tax payers: ");
        int taxPayer = sc.nextInt();

        for (int i = 0; i < taxPayer; i++) {

            System.out.println("TaxPayer #" + i + 1 + " data :");
            System.out.println("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);

            System.out.println("Name : ");
            String name = sc.next();

            System.out.println("Anual income: ");
            double income = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new Person(name, income, health));

            } else if (ch == 'c') {
                System.out.println("Number of employees:");
                int workers = sc.nextInt();
                list.add(new Company(name, income, workers));

            } else {
                System.out.println("Unknown tax payer");
            }
        }
            double sun = 0.0;
            for (TaxPayer t : list) {
                double tax = t.tax();

                System.out.println();
                System.out.println((t.getName() + ": $" + String.format("%.2f", t.tax())));
                sun +=tax;

            }

            System.out.println("Total tax :"+String.format("%.2f", sun));



        }


    }
