package bankaccount;
import java.util.Date;


public class account {
    private int id;
    private  double balance;
    private  double annualInterestRate;
    private  Date dateCreated;
   public account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
   public account(int a, double b){
        this();
        this.id = a;
        this.balance = b;

        }
        public void setID(int a){
            this.id = a;
            }
        public int getID(){
            return this.id;
        }
    public void setBalance(double a){
        this.balance = a;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAnnualInterestRate(double a){
        this.annualInterestRate = a;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDate(){
        return this.dateCreated;
    }
    public double  getMonthlyInterestRate(){
        double monthlyinterestrate = (this.annualInterestRate / 12);
        return monthlyinterestrate;
    }
    public double getMonthlyInterest(){
        double monthlyinterestrate = (this.annualInterestRate / 12);
        double monthlyInterest = (this.balance*monthlyinterestrate);
        return monthlyInterest;
        }
        public  void withdraw(double a){

        if(this.balance > a){
            this.balance = this.balance - a;
            System.out.println("new balance is " + this.balance);

        }else {
            System.out.println("Insufficient funds");

        }

            }
            public void deposit(double a){
                    this.balance = this.balance + a;
                    System.out.println("new balance is " + this.balance);


        }
    public String toString() {
       return "Customer id " + this.getID() + " your balance is " + this.getBalance()
       + " your annual interest rate is " + this.getAnnualInterestRate() + " Your account was created on " + this.getDate();

    }

}


