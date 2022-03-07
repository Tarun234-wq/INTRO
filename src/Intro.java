import java.util.Scanner;
import java.util.ArrayList;
public class Intro {
    public  static int Average(int [] arr){
        int sum  = 0;
        for(int i = 0; i<5; i++)
        {
            sum+=arr[i];

        }
        int average = sum/5;
        return average;
    }
    public  static  void main(String[] args){
        int x;
        Scanner Sc = new Scanner(System.in);
        x = Sc.nextInt();
        System.out.println(x);
        int[]arr = new int[5];
        System.out.println("Enter the Array Elements:");
        for(int i = 0; i<5; i++)
        {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Array Elements Are:");
        for(int i: arr){
            System.out.println(i);

        }

        int sum = 0;
        for(int i = 0; i<5; i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of Array Element is:");
        System.out.println(sum);
        System.out.println("Average of Array element is:");
        System.out.println(Average(arr));






    }

}
