package com.djt.algorithm.sort.impl;

import com.djt.algorithm.sort.IArraySort;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author 　djt317@qq.com
 * @since 　 2021-01-28
 */
public class InsertSort implements IArraySort {

    /*
     将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
     从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
     */

    @Override
    public int[] sort(final int[] sourceArray) {
        Validate.notNull(sourceArray);
        int[] sortArr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < sortArr.length; i++) {
            int tmp = sortArr[i];
            int j = i - 1;
            while (j >= 0 && sortArr[j] > tmp) {
                sortArr[j + 1] = sortArr[j];
                --j;
            }
            sortArr[j + 1] = tmp;
        }

        return sortArr;
    }

    @Override
    public String getName() {
        return "插入排序";
    }
}
