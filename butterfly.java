import java.util.*;
public class butterfly {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

      //upper half
        for(int i =1;i<=n;i++)

        //1st half
        {
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//lower half
        for(int i=n; i>=1; i--){

            //1st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        
    }
}
