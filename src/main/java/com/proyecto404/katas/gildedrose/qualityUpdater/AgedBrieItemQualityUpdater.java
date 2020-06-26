package com.proyecto404.katas.gildedrose.qualityUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class AgedBrieItemQualityUpdater implements QualityUpdater {
    public void update(Item item) {
        tryIncreaseQuality(item);
        if (item.getSellIn() < 0) {
            tryIncreaseQuality(item);
        }
    }

    private void tryIncreaseQuality(Item item) {
        if (isMaxQuality(item)) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    private boolean isMaxQuality(Item item) {
        return item.getQuality() < 50;
    }
}
