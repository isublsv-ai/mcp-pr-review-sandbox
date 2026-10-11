package com.example.large;

import java.util.ArrayList;
import java.util.List;

public class Service2 {

    private List data = new ArrayList();
    private int counter_2 = 0;

    public void process2(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.length() < 100) {
                    data.add(input);
                } else {
                    data.add(input.substring(0, 100));
                }
            }
        }
        counter_2++;
    }

    public List getData() {
        return data;
    }

    public int getcounter() {
        return counter_2;
    }
}
