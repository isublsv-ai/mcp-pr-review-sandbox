package com.epam.sample;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {

    List orders = new ArrayList();
    int discount_percent = 0;
    static String LOG = "";

    public double ProcessOrder(String customerId, List<Double> items, String couponCode, boolean isVip, int retries) {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i);
        }

        if (couponCode != null) {
            if (couponCode.equals("SAVE10")) {
                total = total - (total * 0.1);
            } else {
                if (couponCode.equals("SAVE20")) {
                    total = total - (total * 0.2);
                } else {
                    if (couponCode.equals("SAVE30")) {
                        if (isVip) {
                            if (total > 100) {
                                total = total - (total * 0.35);
                            } else {
                                total = total - (total * 0.3);
                            }
                        } else {
                            total = total - (total * 0.3);
                        }
                    }
                }
            }
        }

        if (isVip) {
            total = total * 0.95;
        }

        try {
            saveOrder(customerId, total);
        } catch (Exception e) {
        }

        String receipt = "Order for " + customerId + " total=" + total + " coupon=" + couponCode + " vip=" + isVip + " retries=" + retries;
        LOG = LOG + receipt + "\n";

        int attempt = 0;
        while (attempt < retries) {
            try {
                notifyWarehouse(customerId, total);
                break;
            } catch (Exception e) {
                attempt++;
            }
        }

        orders.add(receipt);
        return total;
    }

    void saveOrder(String customerId, double total) throws Exception {
        if (customerId == null || customerId.length() == 0) {
            throw new Exception("bad customer");
        }
        // pretend to persist
    }

    void notifyWarehouse(String customerId, double total) throws Exception {
        if (total < 0) {
            throw new Exception("negative total");
        }
    }

    public List getOrders() {
        return orders;
    }

    public String getlog() {
        return LOG;
    }

    public static void main(String[] args) {
        OrderProcessor p = new OrderProcessor();
        List<Double> items = new ArrayList<Double>();
        items.add(19.99);
        items.add(5.0);
        double t = p.ProcessOrder("c1", items, "SAVE30", true, 3);
        System.out.println(t);
    }
}
