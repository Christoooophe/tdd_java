package org.example.Exercice5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ShopTest {
    private Shop shop;
    private List<Products> products;
    @Before
    public void setUp() {
        shop = new Shop(products);
    }

    @Test
    @DisplayName("Décrémente les valeurs lorsque la fonction est appelée")
    public void WhenFunctionCalledSellinAndQuality_5_10_ThenReturn_4_9() {
        Product product = new Product("Alimentaire", "Chocolat", 10, 5);
        shop.update(product);
        Assert.assertEquals(9, product.getQuantity());
        Assert.assertEquals(4, product.getSellIn());
    }

    @Test
    @DisplayName("Décrémente la qualité deux fois plus vite lorsque sellIn est égal à 0")
    public void WhenSellIn_0_AndQuality_5_ThenQuality_3() {
        Product product = new Product("Alimentaire", "Chocolat", 0, 5);
        shop.update(product);
        Assert.assertEquals(3, product.getQuality());
    }

    @Test
    @DisplayName("La qualité n'est jamais négative")
    public void WhenQuality_0_ThenReturnQuality_0() {
        Product product = new Product("Alimentaire", "Chocolat", 5, 0);
        shop.update(product);
        Assert.assertEquals(0, product.getQuality());
    }

    @Test
    @DisplayName("La qualité n'est jamais supérieure à 50")
    public void WhenQualitySuperior_50_ThenReturn_50() {
        Product product = new Product("Alimentaire", "Chocolat", 5, 500);
        shop.update(product);
        Assert.assertEquals(50, product.getQuality());
    }

    @Test
    @DisplayName("La qualité du « brie vieilli » augmente à mesure qu'il vieillit")
    public void WhenBrieSellIn_10_AndQuality_10_ThenReturnQuality_11() {
        Product product = new Product("Alimentaire", "Brie vieilli", 10, 10);
        shop.update(product);
        Assert.assertEquals(11, product.getQuality());
    }

    @Test
    @DisplayName("Les produits laitiers se dégradent en qualité deux fois plus vite que les produits normaux")
    public void WhenProduitLaitierSellIn_10_AndQuality_10_ThenReturnQuality_8() {
        Product product = new Product("Laitier", "Lait", 10, 10);
        shop.update(product);
        Assert.assertEquals(8, product.getQuality());
    }
}
