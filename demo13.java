import java.util.*;
// This code prints a solid pattern of stars in a right-aligned triangle shape.
public class demo13
 {
    public static void main(String[] args) {
        
        int n=5;

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //numbers --> print row number , row number times
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
