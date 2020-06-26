package com.proyecto404.katas.gildedrose.sellInUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class ItemSellInUpdaterFactory {
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public SellInUpdater getUpdater(Item item) {
        switch (item.name) {
            case SULFURAS:
                return new SulfuraHandlerSellInUpdater();
            default:
                return new NormalItemHandlerSellInUpdater();
        }
    }
}
