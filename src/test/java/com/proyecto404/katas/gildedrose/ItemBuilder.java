package com.proyecto404.katas.gildedrose;

public class ItemBuilder {

    public static ItemBuilder anItem() {
        return new ItemBuilder();
    }
    
    private int sellIn = 0;
    private int quality = 0;
    private String name = "some item";

    ItemBuilder withSellIn(int sellIn) {
        this.sellIn = sellIn;
        return this;
    }

    ItemBuilder withQuality(int quality) {
        this.quality = quality;
        return this;
    }

    ItemBuilder withName(String name) {
        this.name = name;
        return this;
    }

    Item build() {
        return new Item(name, sellIn, quality);
    }
}

