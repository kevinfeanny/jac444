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

import bankaccount.account;



public class bankaccount {
    public static void main(String[] args) {
        System.out.println("New account with 20000 balance");
        account a = new account(1122, 20000);
        System.out.println("Set interset rate to 4.5");
        a.setAnnualInterestRate(4.5);
        System.out.println("Withdraw 2500");
        a.withdraw(2500);
        System.out.println("Deposit 3000");
        a.deposit(3000);
        System.out.println("Balance is " + a.getBalance());



    }
}
