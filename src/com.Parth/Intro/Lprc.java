package com.Parth.Intro;

import java.util.ArrayList;

public class Lprc {
    public static void main(String[] args) {
//        int ans = (6, 6);
        System.out.println(ans(new int[]{2,3,3,4,2,6,4}));
    }

    static int ans(int[] arr) {
        int unique = 0;
        for(int n : arr) {
            unique ^= n;
        }
        return unique;
    }








//
//    public static int commonFactors(int a, int b) {
//        ArrayList<Integer> ap = new ArrayList<>();
//        ArrayList<Integer> bp = new ArrayList<>();
//
//        for(int i = 1; i <= a; i++) {
//            if(a % i == 0) {
//                ap.add(i);
//            }
//        }
//        for(int j = 1; j <= b; j++) {
//            if(b % j == 0) {
//                bp.add(j);
//            }
//        }
//
//        int i = 0, j = 0, cnt = 0;
//        while(i < ap.size() && j < bp.size()) {
//            if(ap.get(i) == bp.get(j)) {
//                cnt++;
//                i++;
//                j++;
//            } else if(ap.get(i) < bp.get(j)) {
//                i++;
//            } else {
//                j++;
//            }
//        }
////        System.out.println(ap.toString());
////        System.out.println(bp.toString());
//        return cnt;
//    }
}
