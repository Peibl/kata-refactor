package com.proyecto404.katas.gildedrose;

public class ItemsHandlerFactory {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public ItemsHandler getHandler(Item item) {
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrieItemHandler();
            case BACKSTAGE_PASSES:
                return new BackstagePasses();
            case SULFURAS:
                return new Sulfura();
            default:
                return new NormalItem();
        }
    }
}
