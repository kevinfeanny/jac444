package bankaccount;

public class chequingaccount extends  account{

    private double overdraftammount;
    public chequingaccount(){
        super();
        this.overdraftammount = 0;
    }
    public  chequingaccount(int a, double b){
        super(a,b);
        this.overdraftammount=0;
        }
        public void setodammt(double a){
            this.overdraftammount = a;
            }
         public double getodammt() {
             return this.overdraftammount;
         }
    public  void withdraw(double a){
        double d = this.getBalance() - a;


        if(d >= -100){
            this.setBalance(d);
            System.out.println("new balance is " + this.getBalance());


        }else {
            System.out.println("Insufficient funds");

        }

    }
    public String toString() {

        return  super.toString() + " this is a chequing account";

    }

}
