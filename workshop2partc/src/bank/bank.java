package bank;

public class bank {
                int id;
                public double totalassets;
               public  double balance;
                double iowe;
               public  double amowed;
                double limit;
              public  Boolean isunsafe;
public bank(){
    this.totalassets = 0;
    this.balance = 0;
    this.iowe = 0;
    this.amowed = 0;
    this.limit = 0;
    isunsafe = false;

}
public bank(int n,double a, double b){
    this();
    this.id = n;
    this.balance = a;
    this.limit = b;
    totalassets = balance;

}
public void lend(double h){
    iowe = h;
    double b;
    b = totalassets + h;
    totalassets = b;

    if(totalassets < limit){
        isunsafe = true;

    }
    if(totalassets > limit){
        isunsafe = false;
    }
}
public void borrow(double h){
    amowed = h;
    double b;
    b = totalassets - h;
    totalassets = b;

    if(totalassets < limit){
        isunsafe = true;
    }


}


}
