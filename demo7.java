import java.util.*;
// This code calculates the sum of all natural numbers from 0 to n
public class demo7{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
 

    for(int i=0; i<=n; i++){
        sum=sum+i;

    }
    System.out.println(sum);

  }
}