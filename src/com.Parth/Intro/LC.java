package com.Parth.Intro;

import java.util.Arrays;
import java.util.HashSet;

public class LC {
    public static void main(String[] args) {
       int[] ans = findThePrefixCommonArray(new int[]{1,3,2,4}, new int[] {3,1,2,4});
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ret = new int[A.length];
        HashSet<Integer> freq = new HashSet<>();
        int nums = 0;
        for(int i = 0; i < A.length; i++) {
            if (!freq.contains(A[i])) {
                freq.add(A[i]);
            } else {
                nums++;
            }
            if (!freq.contains(B[i])) {
                freq.add(B[i]);
            } else {
                nums++;
            }
            ret[i] = nums;
        }

        return ret;
    }

//    static int maxDivScore(int[] nums, int[] divisors) {
//        int cnt = 0;
//        int max = 0;
//
//        for (int i = 0; i < divisors.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] % divisors[i] == 0) {
//                    cnt++;
//                }
//            }
//            if (cnt > max) {
//                max = cnt;
//                cnt = 0;
//            }
//        }
//        return max;
//    }


//    static int countOperations(int num1, int num2) {
//        int cnt = 0;
//        while (num1 != 0 || num2 != 0) {
//            if (num1 >= num2) {
//                cnt++;
//                num1 -= num2;
//            } else {
//                cnt++;
//                num2 -= num1;
//            }
//        }
//        return cnt;
//    }


//    static  int countOperations(int num1, int num2) {
//        int cnt = 0;
//        if(num1 == 0 || num2 == 0) {
//            return cnt;
//        }
//        if(num1 >= num2) {
//            num1 -= num2;
//            cnt++;
//            return countOperations(num1, num2);
//        } else {
//            num2 -= num1;
//            cnt++;
//            return countOperations(num1, num2);
//        }
//    }
}
