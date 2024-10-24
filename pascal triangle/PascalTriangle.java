import java.util.Scanner;
public class PascalTriangle{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        int [][] pascal=new int[n][n];
        for(int i=0;i<n;i++){ 
            pascal[i][0]=1; //the first and last ele int every is 1
            pascal[i][i]=1;
            for(int j=1;j<i;j++){
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(pascal[i][j]+ " ");
            }
            System.out.println();
        }
    }
}