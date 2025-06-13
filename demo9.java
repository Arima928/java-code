import java.util.*;
public class demo9 {
// Print a rectangle of stars with n rows and m columns
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=m; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
       }
    }