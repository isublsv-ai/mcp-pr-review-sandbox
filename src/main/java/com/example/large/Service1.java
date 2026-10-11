package com.example.large;

import java.util.ArrayList;
import java.util.List;

public class Service1 {

    private List data = new ArrayList();
    private int counter_1 = 0;

    public void process1(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.length() < 100) {
                    data.add(input);
                } else {
                    data.add(input.substring(0, 100));
                }
            }
        }
        counter_1++;
    }

    public List getData() {
        return data;
    }

    public int getcounter() {
        return counter_1;
    }
}
