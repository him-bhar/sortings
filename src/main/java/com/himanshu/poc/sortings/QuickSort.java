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
 * {@https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm} 
 * {@http://howtodoinjava.com/algorithm/merge-sort-java-example/}
 *
 */
public class QuickSort {
  
  public int[] sort(int[] a) {
    return quickSort(a, 0, a.length-1);
  }
  
  private int[] quickSort(int[] a, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int partitionIndex = partition(a, startIndex, endIndex);
      quickSort(a, startIndex, partitionIndex);
      quickSort(a, partitionIndex+1, endIndex);
    }
    return a;
  }
    
  private int partition(int[] a, int startIndex, int endIndex) {
    int i, j, pivot;
    pivot = a[startIndex];
    i=startIndex;
    j=endIndex;
    
    while (true) {
      while(a[i] < pivot) {
        i++;
      }
      while(a[j] > pivot) {
        j--;
      }
      if(i < j) {
        swap(a, i, j);
      } else {
        return j;
      }
    }
  }
  
  private void swap(int[] a, int leftPointer, int rightPointer) {
    int temp = a[leftPointer];
    a[leftPointer] = a[rightPointer];
    a[rightPointer] = temp;
  }

  public static void main(String[] args) {
    QuickSort iSort = new QuickSort();
    int[] sortedArr = iSort.sort(new int[] {0,1,4,3,2, -1, 100});
    for (int i=0;i<sortedArr.length;i++) {
      System.out.print(sortedArr[i]+",");
    }
  }
}
