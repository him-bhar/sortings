package com.himanshu.poc.sortings;

/**
 * Based on {@http://howtodoinjava.com/algorithm/merge-sort-java-example/}
 *
 */
public class MergeSortTry {
  int[] sort(int[] a) {
    return mergeSort(a, 0, a.length-1);
  }

  private int[] mergeSort(int[] a, int start, int end) {
    if (start < end) {
      int mid = (start+end)/2;
      mergeSort(a, start, mid);
      mergeSort(a, mid+1, end);
      merge(a, start, mid, end);
    }
    return a;
  }

  private void merge(int[] a, int start, int mid, int end) {
    int b[] = new int[a.length];
    int i=start;
    int leftPartCounter = start;
    int rightPartCounter = mid+1;
    while (leftPartCounter <= mid && rightPartCounter <= end) {
      if (a[leftPartCounter] < a[rightPartCounter]) {
        b[i++] = a[leftPartCounter++];
      } else {
        b[i++] = a[rightPartCounter++];
      }
    }
    if (leftPartCounter <= mid) {
      for (int j=leftPartCounter;j<=mid;j++) {
        b[i++] = a[j];
      }
    }
    if (rightPartCounter <= end) {
      for (int j=rightPartCounter;j<=end;j++) {
        b[i++] = a[j];
      }
    }
    for (int j=start;j<=end;j++) {
      a[j] = b[j];
    }
  }
  
  public static void main(String[] args) {
    MergeSortTry iSort = new MergeSortTry();
    int[] sortedArr = iSort.sort(new int[] {0,1,4,3,2, -1, 100});
    for (int i=0;i<sortedArr.length;i++) {
      System.out.print(sortedArr[i]+",");
    }
  }
}
