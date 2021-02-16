
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Surya Prakash
 */
public class SelectionSort {
    public static void main (String args[])
    {
   int[] arr=new int [10]; 
    int i=-1, stopper=-1;
     System.out.println("Enter numbers upto 10 : ");
    do{
        i++;
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the "+(i+1)+" number : ");
    arr[i]=scan.nextInt();
   
    }
    while(arr[i]!=stopper&&i!=9);
  
    for(int m=0;m<i;m++)
        for(int n=(m+1);n<i;n++)
        {
            if(arr[m]>=arr[n])
            {
              int temp = arr[m];
                arr[m]=arr[n];
                arr[n]=temp;
            }
        }
     System.out.println("printing the values in sorted order :");
    
    for(int j=0;j<i;j++)
         System.out.println( arr[j]);
    
    }
}
