package com.lpy.utils;

public class SecondToFormatUtils {
    public static String secondToTime(long seconds) {


        long hours = seconds / 3600;//转换小时数
        seconds = seconds % 3600;//剩余秒数
        long minutes = seconds / 60;//转换分钟
        seconds = seconds % 60;//剩余秒数

        String hour = "";
        String minute = "";
        String second = "";

        hour = String.format("%02d", hours);
        minute = String.format("%02d", minutes);
        second = String.format("%02d", seconds);

        String ddHHmmss =hour + ":" + minute + ":" + second;

        return ddHHmmss;

    }
}
