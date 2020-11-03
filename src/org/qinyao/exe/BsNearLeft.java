package org.qinyao.exe;

public class BsNearLeft {

    public static int neaeindex(int []arr,int value){
        int l=0;
        int r=arr.length-1;
        int index=-1;
        while(l<=r){
            int mid=l+((r-l)>>1);
            if(arr[mid]>=value){
                index=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return index;
    }
}
