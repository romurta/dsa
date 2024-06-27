package com.rmurta.algo;

public class LinearSearchList {

  public static boolean search(int[] arr, int x){
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == x) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = {1,3,6,8,0,8};
    System.out.println(search(arr,8));
  }

}
