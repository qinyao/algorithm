package org.qinyao.exe;

public class BsExist {
    public static boolean exist(int []a ,int m){
        int l=0;
        int r=a.length-1;
        int mid=0;
        while(l<r){
            mid=l+((r-l)>>1);
            if(a[mid]==m){
                return true;
            }else if(a[mid]>m){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return false;
    }
}
