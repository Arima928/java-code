import java.util.*;
public class diamond {

    public static void main(String[] args) {
        
        int n=4;

        for(int i=1; i<=4; i++){
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // lower half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        
    }

    
}
}
// This code prints a diamond pattern of stars.
