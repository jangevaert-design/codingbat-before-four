package edu.cnm.deepdive;

/*

Given a non-empty array of ints, return a new array containing the elements from the original array
that come before the first 4 in the original array. The original array will contain at least one 4.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 */

import java.util.Arrays;

public class CodingBatBeforeFour {

  public static void main(String[] args) {
    System.out.println("For the array [1, 2, 4, 1], the outcome will be "
        + Arrays.toString(pre4(new int[]{1, 2, 4, 1})) + ".");
    System.out.println("For the array [3, 1, 4], the outcome will be "
        + Arrays.toString(pre4(new int[]{3, 1, 4})) + ".");
    System.out.println("For the array [1, 4, 4], the outcome will be "
        + Arrays.toString(pre4(new int[]{1, 4, 4})) + ".");
  }

  public static int[] pre4(int[] nums) {
    int[] result;
    int count = 0;

    for (int i = 0; nums[i] != 4; i++) {
      count++;
    }

    result = new int[count];

    for (int i = 0; i < count; i++) {
      result[i] = nums[i];
    }
    return result;
  }

}
