package com.proyecto404.katas.gildedrose;

import org.junit.Test;

import java.util.Arrays;

import static com.proyecto404.katas.gildedrose.GildedRose.updateQuality;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AgedBrieUpdateQualityTest {

    @Test
    public void increases_quality_the_older_it_gets() {
        Item agedBrie = anAgredBrie().withSellIn(1)
                                     .withQuality(1)
                                     .build();

        updateQuality(Arrays.asList(agedBrie));
        assertThat(agedBrie.getQuality(), is(2));
    }

    @Test
    public void never_increases_over_50() {
        Item agedBrie = anAgredBrie().withSellIn(1)
                                     .withQuality(50)
                                     .build();

        updateQuality(Arrays.asList(agedBrie));
        assertThat(agedBrie.getQuality(), is(50));
    }
    
    private ItemBuilder anAgredBrie() {
        return ItemBuilder.anItem().withName("Aged Brie");
    }
}
