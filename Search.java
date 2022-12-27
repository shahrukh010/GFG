package com.code.main.search;

public class Search {



    public int binarySearch(int[] input, int target){

        int low = 0;
        int high = input.length-1;//n-1 because of low is start from 0

        while(low <= high){

            int mid = (low+high) / 2;//if we have not large set of array then we can use or where overflow situation not raise
//            int mid = low +(high - low) / 2;//this formula for if we have largest set of array to overcome overflow

            if(input[mid] == target)
                return mid;

            if(input[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }


}

