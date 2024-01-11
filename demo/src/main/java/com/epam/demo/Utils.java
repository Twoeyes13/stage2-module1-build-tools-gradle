package com.epam.demo;

import java.util.List;
//import com.epam.utils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String el : args) {
            if (el.isEmpty() || el == null)  return false;
            if (Double.parseDouble(el) < 1) return false;
        }
        return true;
    }
}