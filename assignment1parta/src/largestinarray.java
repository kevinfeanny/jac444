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

import java.util.InputMismatchException;
import java.util.Scanner;
import locatepkge.Location;

public class largestinarray {


    public static void main(String[] args) {


        // Create a Scanner object to allow the user to input the desired number of
        // rows and columns
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of rows and columns of the array: ");
            int numberOfRows = input.nextInt();
            int numberOfColumns = input.nextInt();
            input.nextLine();
            // Create a new Array object



        double[][] a = new double[numberOfRows][numberOfColumns];
        // Ask the user to input the contents of the array and set them accordingly

        System.out.println("Enter the desired contents of the array: ");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = input.nextDouble();
            }
        }

        // Call the locateLargest method and print out the desired information

        Location location = Location.locateLargest(a);

        System.out.println("The location of the largest element is "

                + location.maxValue + " at ("

                + location.row + ", " + location.column + ")");

        }catch(InputMismatchException e){
            System.out.println("please enter only integers");
        }

    }


    // locateLargest method uses a for loop to establish the maximum value and

    // locate its coordinates


}

