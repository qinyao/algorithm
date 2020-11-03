package org.qinyao.sort;

public class BubbleSort {
   public static void sort(int []arr){
       if(arr==null|| arr.length<2){
           return;
       }
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                   swap(arr ,j,j+1);
               }
           }
       }
   }
    public static void swap(int[] arr, int i, int j) {
        if(i!=j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }

    }

    public static void main(String[] args) {
        int a[]=new int[]{12,10,23,19,8};
        sort(a);
        for(int m:a){
            System.out.println(m);
        }
    }
}
