package com.example.large;

import java.util.ArrayList;
import java.util.List;

public class Service10 {

    private List data = new ArrayList();
    private int counter_10 = 0;

    public void process10(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.length() < 100) {
                    data.add(input);
                } else {
                    data.add(input.substring(0, 100));
                }
            }
        }
        counter_10++;
    }

    public List getData() {
        return data;
    }

    public int getcounter() {
        return counter_10;
    }
}
