package com.example.large;

import java.util.ArrayList;
import java.util.List;

public class Service16 {

    private List data = new ArrayList();
    private int counter_16 = 0;

    public void process16(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.length() < 100) {
                    data.add(input);
                } else {
                    data.add(input.substring(0, 100));
                }
            }
        }
        counter_16++;
    }

    public List getData() {
        return data;
    }

    public int getcounter() {
        return counter_16;
    }
}
