package org.qinyao.bs;

public class BSExist {

    public static boolean exist(int []sorted,int num ){
        if(sorted==null|| sorted.length==0){
            return false;
        }
        int L=0;
        int R=sorted.length-1;
        int mid=0;
        while(L<R){
            mid=L+((R-L)>>1);
            if(sorted[mid]==num){
                return true;
            }else if(sorted[mid]>num){
                R=mid-1;
            }else {
                L=mid+1;
            }
        }
        return sorted[L]==num;
    }

}
