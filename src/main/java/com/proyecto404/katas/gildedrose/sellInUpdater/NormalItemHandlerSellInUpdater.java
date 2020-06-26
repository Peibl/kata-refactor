package com.proyecto404.katas.gildedrose.sellInUpdater;

import com.proyecto404.katas.gildedrose.Item;

public class NormalItemHandlerSellInUpdater implements SellInUpdater {
    public void update(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }
}
