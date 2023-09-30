package Array;

import java.util.Scanner;

public class MyArray {
    public static void printArray(int[] arr){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void printArray(long[] arr){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void printArray(float[] arr){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void printArray(double[] arr){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void printArray(char[] arr){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void printArray(String[] arr){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void printArray(boolean[] arr){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public static void printreverseArray(int[] arr){
        System.out.print("[");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }


    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void inputArray(int arr[]){
        System.out.println("Enter the Element in Array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void inputArray(long arr[]){
        System.out.println("Enter the Element in Array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLong();
        }
    }
    public static void inputArray(float arr[]){
        System.out.println("Enter the Element in Array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextFloat();
        }
    }
    public static void inputArray(double arr[]){
        System.out.println("Enter the Element in Array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLong();
        }
    }
    public static void inputArray(char arr[]){
        System.out.println("Enter the Element in Array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            String str = sc.next();
            char ch = str.charAt(0);
            arr[i] = ch;
        }
    }
    public static void inputArray(String arr[]){
        System.out.println("Enter the Element in Array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }
    }
}
