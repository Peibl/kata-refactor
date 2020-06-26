package com.proyecto404.katas.gildedrose;

import com.proyecto404.katas.gildedrose.handlers.QualityUpdater;
import com.proyecto404.katas.gildedrose.handlers.ItemsUpdaterFactory;
import com.proyecto404.katas.gildedrose.handlers.SellInUpdater;

import java.util.ArrayList;
import java.util.List;
//Separar manejo de sell in de quality
//QualityUpdater
//SellIn updater
//ordenar namespaces
//handler en implementaciones
public class GildedRose {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality(items);

        for (Item item : items) {
            System.out.println("Item: " + item.name + ",Quality: " + item.quality + ",SellIn: " + item.sellIn);
        }
    }

    public static void updateQuality(List<Item> items) {
        ItemsUpdaterFactory factory = new ItemsUpdaterFactory();
        for (Item item : items) {
            QualityUpdater qualityUpdater = factory.getQualityUpdater(item);
            qualityUpdater.update(item);
            SellInUpdater sellInUpdater = factory.getSellInUpdater(item);
            sellInUpdater.update(item);
        }
    }
}
