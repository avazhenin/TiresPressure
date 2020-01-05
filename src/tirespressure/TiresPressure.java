/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirespressure;

import java.util.Scanner;

/**
 *
 * @author lagi
 */
public class TiresPressure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rightFront = 0;
        int leftFront = 0;
        int rightRear = 0;
        int leftRear = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter right front tire pressure: ");
            rightFront = sc.nextInt();

            System.out.print("Enter left front tire pressure: ");
            leftFront = sc.nextInt();

            System.out.print("Enter right rear tire pressure: ");
            rightRear = sc.nextInt();

            System.out.print("Enter legt rear tire pressure: ");
            leftRear = sc.nextInt();

            if ((rightFront >= 30 && rightFront <= 38)
                    && (leftFront <= 38 && leftFront >= 30)
                    && (rightRear <= 42 && rightRear >= 40)
                    && (leftRear <= 42 && leftRear >= 40)) {
                System.out.println("Inflation is OK");
            } else {
                System.out.println("There's something wrong with your pressure in tires");
            }
        } catch (Exception e) {
            System.out.println("Bad tire pressure value was entered");
        }


        sc.close();
        return;

    }
}
