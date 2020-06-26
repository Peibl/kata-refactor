package com.proyecto404.katas.gildedrose.qualityUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class NormalItemHandlerQualityUpdater implements QualityUpdater {
    public void update(Item item) {
        int quality = calculateQuality(item);
        setQuality(quality, item);
    }

    private void setQuality(int quality, Item item) {
        item.setQuality(quality);
        if(item.getQuality() < 0) item.setQuality(0);
    }

    private int calculateQuality(Item item) {
        int quality = item.getQuality();
        quality--;
        if (item.getSellIn() <= 0) {
            quality--;
        }
        return quality;
    }
}