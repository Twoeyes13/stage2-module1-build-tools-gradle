package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        if (str == null || str.isEmpty())  return false;
        if (str.matches("-?\\d+(\\.\\d+)?")) {
            if (Double.parseDouble(str) < 1) return false;
        } else return false;
        return true;
        //return Integer.parseInt(str)>-1;
    }
}
