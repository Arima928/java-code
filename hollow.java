import java.util.*;

public class hollow
 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=m; j++)
            {
                // Print stars for the first and last row
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                // Print spaces for the hollow part4
                

                }
                }
            System.out.println(); // Move to the next line after each row
            }
        }
    }
    

