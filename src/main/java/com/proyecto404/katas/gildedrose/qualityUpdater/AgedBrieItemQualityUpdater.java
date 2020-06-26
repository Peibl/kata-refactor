package com.proyecto404.katas.gildedrose.qualityUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class AgedBrieItemQualityUpdater implements QualityUpdater {
    public void update(Item item) {
        int quality = calculateQuality(item);
        setQuality(quality, item);
    }

    private void setQuality(int quality, Item item) {
        item.setQuality(quality);
        if(item.getQuality() > 50) item.setQuality(50);
    }

    private int calculateQuality(Item item) {
        int quality = item.getQuality();
        quality++;
        if (item.getSellIn() < 0) {
          quality++;
        }
        return quality;
    }
}
