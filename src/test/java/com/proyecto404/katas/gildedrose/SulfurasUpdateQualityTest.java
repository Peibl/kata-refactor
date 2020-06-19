package com.proyecto404.katas.gildedrose;

import org.junit.Test;

import java.util.Arrays;

import static com.proyecto404.katas.gildedrose.GildedRose.updateQuality;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SulfurasUpdateQualityTest {

    @Test
    public void never_has_to_be_sold() {
        Item sulfuras = sulfuras();
        
        updateQuality(Arrays.asList(sulfuras));
        assertThat(sulfuras.getSellIn(), is(0));
    }

    @Test
    public void never_decreases_quality() {
        Item sulfuras = sulfuras();
        
        updateQuality(Arrays.asList(sulfuras));
        assertThat(sulfuras.getQuality(), is(80));
    }
    
    private Item sulfuras() {
        return ItemBuilder.anItem().withName("Sulfuras, Hand of Ragnaros")
                       .withSellIn(0)
                       .withQuality(80)
                       .build();
    }
}
