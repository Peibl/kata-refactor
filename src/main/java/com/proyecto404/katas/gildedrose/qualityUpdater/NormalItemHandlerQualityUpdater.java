package com.proyecto404.katas.gildedrose.qualityUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class NormalItemHandlerQualityUpdater implements QualityUpdater {
    public void update(Item item) {
        if(item.getQuality() <= 0) return;
        tryDecreaseQuality(item);
        if (item.getSellIn() <= 0) {
            tryDecreaseQuality(item);
        }
    }

    private void tryDecreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}