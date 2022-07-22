package indi.likai.leetcode;

public class SqrtX_69 {
    public static void main(String[] args) {
        SqrtX_69 s = new SqrtX_69();
        System.out.println(s.mySqrt(4));
        // 0 1 2 3 4 5 6  --  7 8 9 10 11 12 13
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }
        int left = 2;
        int right = x ;
        int mid ;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (x / mid == mid) {
                return mid;
            }
            if (x / mid > mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }


}
