package org.example;
import java.net.ServerSocket;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float[] array1 = {90.5f, 80.5f, 70.5f, 60.5f};
//        float sum = 0;
//        for (float element : array1) {
//            sum = sum + element;
//        }
//        System.out.println(sum);

        // Search in Array
//        int [] array1 = {90, 80, 70, 60};
//        int a = sc.nextInt();
//        boolean found=false;
//        for (float element : array1)
//        {
//            if(a==element)
//            {
//                found=true;
//            }
//        }
//        if(found){
//            System.out.println("Number Is present In Array");
//        }
//        else {
//            System.out.println("Number Is Not present In Array");
//        }

//        //Find Average
//        float[] array1 = {90.5f, 80.5f, 70.5f, 60.5f};
//        float sum = 0;
//        float avg=0;
//        for (float element : array1) {
//            sum = sum + element;
//            avg = (sum / (array1.length * 100) )* 100;
//        }
//        System.out.print("Average: ");
//        System.out.println(avg);

        //Matrix addition of 2d Array
        /*
        int [][] arr1 = {{1,3,5},{2,4,6}};
        int [][] arr2 = {{2,4,6},{1,3,5}};
//        int [][] result = new int[2][3];
        int [][] result = {{0,0,0},{0,0,0}};
        for(int i=0; i<arr1.length; i++)
        {
            for (int j=0; j<arr1[i].length; j++)
            {
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0; i<arr1.length; i++)
        {
            for (int j=0; j<arr1[i].length; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
        */
// Array swapping
//        int [] arr ={7,6,5,4,3,2,1};
//        int mid = arr.length/2;
//        int l = arr.length;
//        int temp;
//        for (int i=0; i<mid; i++)
//        {
//            temp=arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for (int e:arr) {
//            System.out.println(e);
//        }
        //Find Minimum Number in Array
        // Min = Integer.MAX_VALUE;
//         Max = Integer.MIN_VALUE;
        int [] arr ={7,6,5,4,3,2,1,10};
        int temp=Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++)
        {
            if (temp>arr[i])
            {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
