package com.example.large;

import java.util.ArrayList;
import java.util.List;

public class Service5 {

    private List data = new ArrayList();
    private int counter_5 = 0;

    public void process5(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.length() < 100) {
                    data.add(input);
                } else {
                    data.add(input.substring(0, 100));
                }
            }
        }
        counter_5++;
    }

    public List getData() {
        return data;
    }

    public int getcounter() {
        return counter_5;
    }
}
