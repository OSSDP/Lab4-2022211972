package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution13Test extends TestCase {
    static Solution13 so = new Solution13();
    //对元素个数为0的用例测试
    //测试用例:[]
    @Test
    public void test1() {
        int nums[] = {};
        int answer[] = {};
        so.sortColors(nums);
        assertArrayEquals(nums,answer);
    }

    //对元素个数为1的用例测试
    //测试用例:[0]
    @Test
    public void test2() {
        int nums[] = {0};
        int answer[] = {0};
        so.sortColors(nums);
        assertArrayEquals(nums,answer);
    }

    //对元素个数为2的用例测试
    //1.两个元素相同
    //2.两个元素不同
    //测试用例[0,0],[1,2]
    @Test
    public void test3() {
        boolean flag = true;
        int nums1[] = {0,0};
        int answer1[] = {0,0};
        so.sortColors(nums1);
        assertArrayEquals(nums1,answer1);

        int nums2[] = {1,2};
        int answer2[] = {1,2};
        so.sortColors(nums2);
        assertArrayEquals(nums2,answer2);
    }

    //对三个元素的用例测试
    //1.三个元素相同
    //2.只有两个元素相同
    //3.三个元素均不相同
    //测试用例:[0,0,0] [0,0,1] [0,1,2]

    @org.junit.Test
    public void test4() {
        int nums1[] = {0,0,0};
        int answer1[] = {0,0,0};
        so.sortColors(nums1);
        assertArrayEquals(nums1,answer1);

        int nums2[] = {0,0,1};
        int answer2[] = {0,0,1};
        so.sortColors(nums2);
        assertArrayEquals(nums2,answer2);

        int nums3[] = {0,1,2};
        int answer3[] = {0,1,2};
        so.sortColors(nums3);
        assertArrayEquals(nums3,answer3);
    }


}