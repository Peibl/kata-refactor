package com.proyecto404.katas.gildedrose.qualityUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class BackstagePassesQualityUpdater implements QualityUpdater {
    public void update(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

        if(item.getSellIn() > 0) {
            if (item.getSellIn() < 11) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }

            if (item.getSellIn() < 6) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
        } else {
            item.setQuality(0);
        }
    }
}
