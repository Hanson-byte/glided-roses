package com.gildedrose.entity;

import com.gildedrose.Item;

/**
 * @ClassName AgedBrie
 * @Description todo
 * @Author XDan
 * @Date 2022/9/2 0:41
 * @Version 1.0
 **/

public class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public AgedBrie( int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }



    @Override
    protected void updateQualityAfter() {
        incrQuality();
    }

    @Override
    protected void updateQuality() {
        incrQuality();
    }
    private void incrQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
