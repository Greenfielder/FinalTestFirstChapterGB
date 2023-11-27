package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Hello", "2", "world", ":-)"};
        ArrayList<String> new_arr = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++)
            if (arr[i].length() <= 3)
                new_arr.add(arr[i]);

        System.out.println(new_arr);
    }
}