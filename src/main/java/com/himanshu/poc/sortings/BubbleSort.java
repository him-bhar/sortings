/*
 * Copyright 2013 Himanshu Bhardwaj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.himanshu.poc.sortings;
/**
 * Based on {@https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm}
 * @author himanshu
 *
 */
public class BubbleSort {
  
  public int[] sort(int[] a) {
    for(int i=0;i<a.length-1;i++) {
      for(int j=0;j<a.length-1-i;j++) {
        int temp;
        //Pair in reverse order, swap them
        if (a[j] > a[j+1]) {
          temp = a[j+1];
          a[j+1] = a[j];
          a[j] = temp;
        }
      }
    }
    return a;
  }
  
  
  public static void main(String[] args) {
    BubbleSort iSort = new BubbleSort();
    int[] sortedArr = iSort.sort(new int[] {1,5,4,2,3});
    for (int i=0;i<sortedArr.length;i++) {
      System.out.print(sortedArr[i]+",");
    }
  }

}
