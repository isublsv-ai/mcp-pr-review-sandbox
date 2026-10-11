package com.example.large;

import java.util.ArrayList;
import java.util.List;

public class Service12 {

    private List data = new ArrayList();
    private int counter_12 = 0;

    public void process12(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.length() < 100) {
                    data.add(input);
                } else {
                    data.add(input.substring(0, 100));
                }
            }
        }
        counter_12++;
    }

    public List getData() {
        return data;
    }

    public int getcounter() {
        return counter_12;
    }
}
