package lab_2;

import  java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1 = Check Balance");
            System.out.println("2 = Deposit");
            System.out.println("3 = Withdraw");
            System.out.println("4 = Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1){
                System.out.println("Balance = " + balance);
            } else if (choice == 2) {
                System.out.println("Enter deposit amount: ");
                double amount = sc.nextDouble();

                if (amount>0){
                    balance += amount;
                    System.out.println("Deposit successful");
                }

                else {
                    System.out.println("invalid deposit");
                }

            } else if (choice==3) {
                double amount = sc.nextDouble();

                if (amount <=0){
                    System.out.println("invalid amount");
                } else if (amount<=balance) {
                    balance-= amount;

                }
            }

            else if (choice == 4) {
                System.out.println("exit");
                break;
            }
            else {
                System.out.println("Invalid option, try again");
            }
        }

        sc.close();


    }
    }

