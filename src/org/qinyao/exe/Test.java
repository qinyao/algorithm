package org.qinyao.exe;

public class Test {
    public static void sort(int []arr){
        if(arr==null||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                minIndex=arr[minIndex]<arr[j]?minIndex:j;
            }
            swap(arr,minIndex,i);
        }
    }

    public static void swap(int []a,int b, int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }

    public static void main(String[] args) {
        int []arr=new int[]{12,89,9,25};
        sort(arr);
        for(int m:arr){
            System.out.println(m);
        }
    }
}
