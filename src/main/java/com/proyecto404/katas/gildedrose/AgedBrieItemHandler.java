package com.proyecto404.katas.gildedrose;

public class AgedBrieItemHandler implements ItemsHandler {
    public void handle(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
