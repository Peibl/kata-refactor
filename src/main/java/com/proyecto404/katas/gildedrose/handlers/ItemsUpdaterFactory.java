package com.proyecto404.katas.gildedrose.handlers;

import com.proyecto404.katas.gildedrose.Item;

public class ItemsUpdaterFactory {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public QualityUpdater getQualityUpdater(Item item) {
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrieItemQualityUpdater();
            case BACKSTAGE_PASSES:
                return new BackstagePassesQualityUpdater();
            case SULFURAS:
                return new SulfuraHandlerQualityUpdater();
            default:
                return new NormalItemHandlerQualityUpdater();
        }
    }

    public SellInUpdater getSellInUpdater(Item item) {
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrieItemSellInUpdater();
            case BACKSTAGE_PASSES:
                return new BackstagePassesSellInUpdater();
            case SULFURAS:
                return new SulfuraHandlerSellInUpdater();
            default:
                return new NormalItemHandlerSellInUpdater();
        }
    }
}
