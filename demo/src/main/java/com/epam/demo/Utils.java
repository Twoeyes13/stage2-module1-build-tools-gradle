package com.epam.demo;

import java.util.List;
//import com.epam.utils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String el : args) {
            if (Double.parseDouble(el) < 0 || el.isEmpty())  return false;
        }
        return true;
    }
}