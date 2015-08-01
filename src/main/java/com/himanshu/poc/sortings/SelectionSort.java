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

public class SelectionSort {
  // 1,5,4,2,3

  public int[] sort(int[] a) {
    int temp;
    for (int i = 0; i < a.length; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[min]) {
          // Set the smallest index to min
          min = j;
        }
      }
      temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
    return a;
  }

  public static void main(String[] args) {
    SelectionSort iSort = new SelectionSort();
    int[] sortedArr = iSort.sort(new int[] { 1, 5, 4, 2, 3 });
    for (int i = 0; i < sortedArr.length; i++) {
      System.out.print(sortedArr[i] + ",");
    }
  }
}
