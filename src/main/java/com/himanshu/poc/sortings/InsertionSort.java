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

public class InsertionSort {
  
  public int[] sort(int[] a) {
    //Just one element no need for sorting
    if (a.length == 1) {
      return a;
    }
    for (int i=1;i<a.length;i++) {
      int key = a[i]; //Initialize key with second element and sort all the way down till first element
      int j=i-1;
      while (a[j] > key && j>=0) {
        a[j+1] = a[j];
        j--;
      }
      a[j+1] = key;
    }
    return a;
  }
  
  // 1,5,4,2,3
  
  public static void main(String[] args) {
    InsertionSort iSort = new InsertionSort();
    int[] sortedArr = iSort.sort(new int[] {1,5,4,2,3});
    for (int i=0;i<sortedArr.length;i++) {
      System.out.print(sortedArr[i]+",");
    }
  }
  
}
