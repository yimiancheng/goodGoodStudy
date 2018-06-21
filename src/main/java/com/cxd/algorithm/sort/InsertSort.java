package com.cxd.algorithm.sort;

/**
 * 插入排序
 *
 *
 * 插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 *
 * 最好情况下：正序有序，则只需要比较n次。故，为O(n)
 *
 * 最坏情况下：逆序有序，则需要比较(n-1)+(n-2)+……+1，故为O(n*n)
 *
 * 在插入排序中，K1是已排序部分中的元素，当K2和K1比较时，直接插到K1的后面(没有必要插到K1的前面，这样做还需要移动！！)，因此，插入排序是稳定的。
 *
 * @author childe
 * @date 2018/6/20 20:53
 **/
public class InsertSort {

//    将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
//    从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）

    static int[] sort(int[] arr) {
        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            for (int j = i; ; j--) {
                if (j > 0 && curr < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    continue;
                }

                // 存在比其小的数，插入
                if (j != i) {
                    arr[j] = curr;
                }
                break;
            }

            // 记录要插入的数据
//            int tmp = arr[i];
//
//            // 从已经排序的序列最右边的开始比较，找到比其小的数
//            int j = i;
//            while (j > 0 && tmp < arr[j - 1]) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//
//            // 存在比其小的数，插入
//            if (j != i) {
//                arr[j] = tmp;
//            }



        }

        return arr;
    }
}