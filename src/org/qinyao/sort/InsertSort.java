package org.qinyao.sort;

public class InsertSort {
    public static void sort(int []arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }

            }
        }
//        for (int i = 1; i < arr.length; i++) { // 0 ~ i ×öµ½ÓÐÐò
//            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
//                swap(arr, j, j + 1);
//            }
//        }
    }
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int []arr=new int[]{12,10,26,14,9};
        sort(arr);
        for(int m:arr){
            System.out.println(m);
        }
    }
}
