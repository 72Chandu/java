import java.io.*;
import java.util.Scanner;
public class diamond{
    public static void main( String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the odd number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i+=2){ //upperhalf
            for(int j=0;j<(n-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=1;i-=2){ //lowerhalf
            for(int j=0;j<(n-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}