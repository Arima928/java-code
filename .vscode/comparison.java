import java.util.*;
public class comparison
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
{
            System.out.println("a is equal to b");
        }
        else{
            if(a>b)
            {
                System.out.println("a is greater");
            }
            else{
                System.out.println("b is greater");
            }
            }
        }
    }
