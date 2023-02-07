/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cloneofassignment2q1;

/**
 *
 * @author rehan
 */
public class CloneOfAssignment2Q1 {

    public static void main(String[] args) {
        int x = 10000;
        System.out.println("gegege");
        while (x > 1) {
            if (hello(x)) {
                System.out.println("something soemthing cody rhodes");
            }
            x--;
        }
    }

    static boolean hello(int num) {
        int j = 1;
        int x = 0;
        while (j < num) {
            j++;
            if ((num % j) == 0) {
                x++;
            }
        }
        return x <= 1;
        
    }
}
