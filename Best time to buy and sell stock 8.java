import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] array = new int[number];//integer input for number of days or number of inputs
        int max =0;
        for(int i=0; i<number; i++)
        {
            array[i]=input.nextInt(); //array input for all values
        }
        for(int i = 0;i<number-1;i++)
            {
                for(int j=i+1;j<number;j++)
                {
                    if(array[j]-array[i]>max)
                    {
                        max = array[j]-array[i];
                    }
                    
                }
            }
        System.out.println(max);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
