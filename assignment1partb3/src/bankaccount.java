/**********************************************

 Workshop # 1
 Course<jac 444> - Semester

 Last Name:Feanny

 First Name:Kevin

 ID:045050036

 Section:jac444sab

 This assignment represents my own work in accordance with Seneca Academic Policy.

 Signature

 Date:6/8/18

 **********************************************/

import bankaccount.*;
import java.util.Scanner;


public class bankaccount {
    public static void main(String[] args) {
       do{
        try {
            System.out.println("Do you want to create saving acoounts or chequing acoounts 1 or 2");
            Scanner tt = new Scanner(System.in);
            int chew = tt.nextInt();
        if(chew == 1){

        savingsaccount[] a;
        a = new savingsaccount[9];
        for (int i = 0; i < 9; i++) {
            a[i] = new savingsaccount(i, 100);

        }
            do {
                try {

                    Scanner x = new Scanner(System.in);
                    System.out.println("Please enter Id :");

                    double id = x.nextDouble();
                    int spot = 0;
                    for (int j = 0; j < a.length; j++) {
                        if (id == a[j].getID()) {
                            spot = j;
                        }

                    }

                    if (spot != 0) {
                        int choice = 0;
                        choice = menu();
                        if (choice == 1) {
                            System.out.println("Your balance is " + a[spot].getBalance());


                        } else if (choice == 2) {
                            System.out.println("Please enter the ammount you wish to withdraw");
                            Scanner sx = new Scanner(System.in);
                            double wthdrwamm = sx.nextDouble();
                            a[spot].withdraw(wthdrwamm);
                            System.out.println("Your new balance is : " + a[spot].getBalance());

                        } else if (choice == 3) {
                            System.out.println("Please enter the ammount you wish to deposit");
                            Scanner sx = new Scanner(System.in);
                            double depamm = sx.nextDouble();
                            a[spot].deposit(depamm);
                            System.out.println("Youre new balance is : " + a[spot].getBalance());


                        } else if (choice == 4) {
                            String s = a[spot].toString();
                            System.out.println(s);
                            break;

                        }
                    } else if (spot == 0) {
                        System.out.println("Account not found");
                    }
                    String s = a[spot].toString();
                    System.out.println(s);
                } catch (Exception h) {
                    System.out.println("Invalid id");
                }

            } while (true) ;
                } else {
            chequingaccount[] a;
            a = new chequingaccount[9];
            for (int i = 0; i < 9; i++) {
                a[i] = new chequingaccount(i, 100);
                a[i].setodammt(100.0);


            }
            do {
                try {
                    Scanner x = new Scanner(System.in);
                    System.out.println("Please enter Id :");
                    double id = x.nextDouble();
                    int spot = 0;
                    for (int j = 0; j < a.length; j++) {
                        if (id == a[j].getID()) {
                            spot = j;
                        }

                    }
                    if (spot != 0) {
                        int choice = 0;
                        choice = menu();
                        if (choice == 1) {
                            System.out.println("Your balance is " + a[spot].getBalance());


                        } else if (choice == 2) {
                            System.out.println("Please enter the ammount you wish to withdraw");
                            Scanner sx = new Scanner(System.in);
                            double wthdrwamm = sx.nextDouble();
                            a[spot].withdraw(wthdrwamm);
                            System.out.println("Youre new balance is : " + a[spot].getBalance());

                        } else if (choice == 3) {
                            System.out.println("Please enter the ammount you wish to deposit");
                            Scanner sx = new Scanner(System.in);
                            double depamm = sx.nextDouble();
                            a[spot].deposit(depamm);
                            System.out.println("Youre new balance is : " + a[spot].getBalance());


                        } else if (choice == 4) {
                            String s = a[spot].toString();
                            System.out.println(s);
                            break;

                        }
                    } else if (spot == 0) {
                        System.out.println("Account not found");
                    }
                    String s = a[spot].toString();
                    System.out.println(s);
                }catch(Exception h){
                    System.out.println("Invalid id");
                }
            }
            while (true);
        }}catch (Exception i){
            System.out.println("Invalid choice");

        }}while ( true);



    }

    public static int  menu(){
        int choice = 0;
        do {
            try {
                System.out.println("Main Menu\n");
                System.out.println("1. check balance");
                System.out.println("2. withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. exit");
                Scanner h = new Scanner(System.in);
                choice = h.nextInt();
                if (choice < 1 || choice > 4) {
                    System.out.println("Please choose between 1 and 4");
                }
            }catch(Exception j){
                System.out.println("Please choose between 1 and 4");
            }
        }while(choice < 1 || choice  > 4);




        return choice;

        }
    }

