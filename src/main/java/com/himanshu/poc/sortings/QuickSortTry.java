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
 * Steps to implement Quick sort:

1) Choose an element, called pivot, from the list. Generally pivot can be the middle index element.
2) Reorder the list so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.
3) Recursively apply the above steps to the sub-list of elements with smaller values and separately the sub-list of elements with greater values.
 *
 */
public class QuickSortTry {
  private int[] sort (int[] a) {
    return quickSort(a, 0, a.length-1);
  }

  private int[] quickSort(int[] a, int start, int end) {
    int pivot = a[end];
    int leftPointer = start;
    int rightPointer = end;
    while (leftPointer <= rightPointer) {
      while(a[leftPointer] < pivot) {
        leftPointer++;
      }
      while(a[rightPointer] > pivot) {
        rightPointer--;
      }
      if (leftPointer <= rightPointer) {
        swap(a, leftPointer, rightPointer);
        leftPointer++;
        rightPointer--;
      }
    }
    if (start < rightPointer) {
      quickSort(a, start, rightPointer);
    }
    if (leftPointer < end) {
      quickSort(a, leftPointer, end);
    }
    return a;
  }

  private void swap(int[] a, int leftPointer, int rightPointer) {
    int temp = a[leftPointer];
    a[leftPointer] = a[rightPointer];
    a[rightPointer] = temp;
  }
  
  public static void main(String[] args) {
    QuickSortTry iSort = new QuickSortTry();
    int[] sortedArr = iSort.sort(new int[] {0,1,4,3,2, -1, 100});
    for (int i=0;i<sortedArr.length;i++) {
      System.out.print(sortedArr[i]+",");
    }
  }
}
