package com.proyecto404.katas.gildedrose.qualityUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class BackstagePassesQualityUpdater implements QualityUpdater {
    public void update(Item item) {
        int quality = calculateQuality(item);
        setQuality(quality, item);
    }

    private void setQuality(int quality, Item item) {
        item.setQuality(quality);
    }

    private int calculateQuality(Item item) {
        if (item.getSellIn() <= 0) return 0;
        int quality = item.getQuality();
        quality++;
        if (item.getSellIn() < 11) {
            quality++;
        }
        if (item.getSellIn() < 6) {
            quality++;
        }
        return quality;
    }
}
