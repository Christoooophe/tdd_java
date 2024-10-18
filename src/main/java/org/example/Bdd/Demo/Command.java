package org.example.Bdd.Demo;

import java.util.ArrayList;
import java.util.List;

public class Command {
    private String from;
    private String to;
    private List<String> products = new ArrayList<String>();

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
