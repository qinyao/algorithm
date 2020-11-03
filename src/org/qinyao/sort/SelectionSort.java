package org.qinyao.sort;

public class SelectionSort {

    public static void swap(int []arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void selectionSort(int []arr){
        if(arr==null|| arr.length<2){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                minIndex=arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void main(String[] args) {
        int [] arr=new int[]{10,23,9,8,11,24};
        selectionSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }

}
