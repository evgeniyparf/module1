package com.evgeniyparf.alevel;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDiffNum(new int[] { 1 , 3, 4, 6, 1, 3, 1, 1}));

    }

    public static int findDiffNum(int[] arr){
        int count = 0;
        top:
        for(int i=0; i < arr.length; i++){
            for(int y = i+1; y < arr.length; y++){
                if(arr[i] == arr[y]){
                    continue top;
                }
            }
            count++;
        }
        return count;
    }
}
