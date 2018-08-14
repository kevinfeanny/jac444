package bankaccount;
import bankaccount.account;


public class savingsaccount extends account {


    public savingsaccount(){
        super();
    }
    public savingsaccount( int a , double b){
        super(a,b);
    }
    public String toString() {

        return  super.toString() + "this is a savings account";

    }


}
