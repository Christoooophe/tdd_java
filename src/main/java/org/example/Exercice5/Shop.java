package org.example.Exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) {
        product.setSellIn(product.getSellIn()-1);

        if (product.getName().equals("Brie vieilli")) {
            product.setQuality(product.getQuality()+1);
        }
        else if (product.getType().equals("Laitier")) {
            product.setQuality(product.getQuality()-2);
        }
        else {
            if (product.getSellIn() <= 0) {
                product.setQuality(product.getQuality()-2);
            }
            else {
                product.setQuality(product.getQuality()-1);
            }
        }

        if (product.getQuality() <= 0) {
            product.setQuality(0);
        }
        else if (product.getQuality() > 50) {
            product.setQuality(50);
        }
    }
}
