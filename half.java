import java.util.*;
public class half {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row;
        }
        }
    }
// This code prints a right-angled triangle pattern of stars
