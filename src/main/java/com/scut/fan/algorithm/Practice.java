package com.scut.fan.algorithm;

/**
 * Created by FAN on 2016/7/11.
 */
public class Practice {
    public static void main(String[] args) {
        String str="fancanhua";
        System.out.println(str.hashCode());
        str=str+"_mod";
        str="fancanhua";
        System.out.println(str.hashCode());

    }
    public static String mod(String string){
        string=string+"_mod";
        return string;
    }
}
