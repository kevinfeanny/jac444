package locatepkge;

// Location class

public class Location {

    public int row, column;

    public double maxValue;

    Location() {
        this.row = 0;
        this.column = 0;
        this.maxValue = 0;
    }
    Location(int a, int b, double c){
        this.row = a;
        this.column= b;
        this.maxValue = c;


    }
    public static Location locateLargest(double[][] a) {
        double maxValue = 0;
        int h = 0 ;
        int u = 0;

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                if (a[i][j] > maxValue) {

                    maxValue = a[i][j];
                    h = i;
                    u = j;
                }
        Location z = new Location(h,u,maxValue);


        return z;
    }
}
