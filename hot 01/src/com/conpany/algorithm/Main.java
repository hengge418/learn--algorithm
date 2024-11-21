package com.conpany.algorithm;

@SuppressWarnings("all")
class Main {
    int[] nums = {2, 7, 11, 15};
    public static void main(String[] args) {
        Main main = new Main();
        int[] res = main.getIndex(13);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }

    public int[] getIndex(int target) {
        int num1 = 0;
        int num2 = 0;
//        定义标签
//        下标为i的数和下标为i+1的数相加
//        下标为i的数和下标为i+2的数相加
//        ...
        loop:
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            for (int j = 1; j < nums.length - i; ++j) {
                num2 = nums[j];
                if (num1 + num2 == target) {
//                    使用标签
                    break loop;
                }
            }
        }
        int[] res = {num1, num2};
        return res;
    }

}
