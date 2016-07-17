package com.scut.fan.algorithm;

/**
 * Created by FAN on 2016/7/6.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class TwoDimensionArraySearch {
    public static void main(String[] args) {

    }

    public boolean Find(int[][] array,int target) {
        boolean found=false;
        int xIndex=0,yIndex=array[0].length-1;
        while ( xIndex<=array.length-1&&yIndex>=0&&found==false){
            if (array[xIndex][yIndex]==target){
                found=true;
            }else if (array[xIndex][yIndex]>target){
                yIndex--;
            }else {
                xIndex++;
            }
        }
        return found;
    }
}
