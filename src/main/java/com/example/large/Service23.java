package com.example.large;

import java.util.ArrayList;
import java.util.List;

public class Service23 {

    private List data = new ArrayList();
    private int counter_23 = 0;

    public void process23(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.length() < 100) {
                    data.add(input);
                } else {
                    data.add(input.substring(0, 100));
                }
            }
        }
        counter_23++;
    }

    public List getData() {
        return data;
    }

    public int getcounter() {
        return counter_23;
    }
}
