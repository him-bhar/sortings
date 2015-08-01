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

public class MergeSort {
  
  public int[] sort(int[] a) {
    mergeSort(a, 0, a.length-1);
    return a;
  }
  
  private void mergeSort(int[] a, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int midIndex = (startIndex+endIndex)/2;
      mergeSort(a, startIndex, midIndex);
      mergeSort(a, midIndex+1, endIndex);
      merge (a, startIndex, midIndex, endIndex);
    }
  }

  private void merge(int[] a, int startIndex, int midIndex, int endIndex) {
    int b[] = new int[a.length];
    int i,j;
    i=startIndex;
    j=midIndex+1;
    int k = startIndex; //For keeping state of 'b'
    
    
    while (i <= midIndex && j <= endIndex) {
      if (a[i] < a[j]) {
        b[k] = a[i];
        i++;
      } else {
        b[k] = a[j];
        j++;
      }
      k++;
    }
    while (i <= midIndex) {
      b[k++] = a[i++];
    }
    while (j <= endIndex) {
      b[k++] = a[j++];
    }
    
    for (k=startIndex;k<=endIndex;k++) {
      a[k] = b[k];
    }
    
  }

  public static void main(String[] args) {
    MergeSort iSort = new MergeSort();
    int[] sortedArr = iSort.sort(new int[] {0,1,4,3,2, -110, -120});
    for (int i=0;i<sortedArr.length;i++) {
      System.out.print(sortedArr[i]+",");
    }
  }

}
