/*
Exercise 2: Create two integer variables, swap their values (exchange them), and print both before
and after swapping.

 */

package Exercise;

import java.sql.SQLOutput;

public class Exercise2 {
    public static void main(String[] args){
        int a=2;
        int b=3;
        System.out.println("Before swapping: "+"a ="+a+ " b ="+b );
        int temp=a;// storing the value of a in a temporary variable
        a=b;
        b=a;
        System.out.println("After swapping: "+"a ="+a+ " b ="+b );

    }
}
