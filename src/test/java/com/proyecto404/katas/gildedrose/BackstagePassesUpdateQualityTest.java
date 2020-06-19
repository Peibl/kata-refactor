package com.proyecto404.katas.gildedrose;

import org.junit.Test;

import java.util.Arrays;

import static com.proyecto404.katas.gildedrose.GildedRose.updateQuality;
import static com.proyecto404.katas.gildedrose.ItemBuilder.anItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BackstagePassesUpdateQualityTest {

    @Test
    public void increases_quality_as_the_selling_day_aproaches() {
        Item backstagePass = aBackstagePass().withQuality(20)
                                             .withSellIn(15)
                                             .build();

        updateQuality(Arrays.asList(backstagePass));
        assertThat(backstagePass.getQuality(), is(21));
    }

    @Test
    public void increases_by_two_if_there_are_betwen_10_and_5_days_to_the_sellin_day() {
       Item backstagePass = aBackstagePass().withQuality(20)
                                            .withSellIn(10)
                                            .build();

        updateQuality(Arrays.asList(backstagePass));
        assertThat(backstagePass.getQuality(), is(22));
        
        backstagePass = aBackstagePass().withQuality(20)
                                        .withSellIn(6)
                                        .build();

        updateQuality(Arrays.asList(backstagePass));
        assertThat(backstagePass.getQuality(), is(22));
    }

    @Test
    public void increases_by_three_if_there_are_betwen_5_and_1_days_to_the_sellin_day() {
        Item backstagePass = aBackstagePass().withQuality(20)
                                             .withSellIn(5)
                                             .build();

        updateQuality(Arrays.asList(backstagePass));
        assertThat(backstagePass.getQuality(), is(23));
      
        backstagePass = aBackstagePass().withQuality(20)
                                        .withSellIn(1)
                                        .build();

        updateQuality(Arrays.asList(backstagePass));
        assertThat(backstagePass.getQuality(), is(23));
    }
    
    @Test
    public void quality_is_zero_when_the_sold_date_has_passed() {
        Item backstagePass = aBackstagePass().withQuality(20)
                                             .withSellIn(0)
                                             .build();

        updateQuality(Arrays.asList(backstagePass));
        assertThat(backstagePass.getQuality(), is(0));
    }

    private ItemBuilder aBackstagePass() {
        return anItem().withName("Backstage passes to a TAFKAL80ETC concert");
    }

}
