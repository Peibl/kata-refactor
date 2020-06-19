package com.proyecto404.katas.gildedrose;

import org.junit.Test;

import java.util.Arrays;

import static com.proyecto404.katas.gildedrose.GildedRose.updateQuality;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NormalItemsUpdateQualityTest {

    @Test
    public void items_degrade_quality_each_update() {
        Item item = ItemBuilder.anItem().withSellIn(1)
                            .withQuality(20)
                            .build();

        updateQuality(Arrays.asList(item));
        assertThat(item.quality, is(19));
    }
    
    @Test
    public void when_the_sellIn_date_has_passed_items_degrade_quality_twice() {
        Item item = ItemBuilder.anItem().withSellIn(0)
                            .withQuality(20)
                            .build();

        updateQuality(Arrays.asList(item));
        assertThat(item.quality, is(18));
    }
    
    @Test
    public void the_quality_of_an_item_is_never_negative() {
        Item item = ItemBuilder.anItem().withQuality(0)
                            .build();

        updateQuality(Arrays.asList(item));
        assertThat(item.quality, is(0));
    }
}
