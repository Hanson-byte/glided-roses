package com.gildedrose.entity;

import com.gildedrose.Item;

/**
 * @ClassName Sulfuras
 * @Description todo
 * @Author XDan
 * @Date 2022/9/2 0:40
 * @Version 1.0
 **/

public class Sulfuras extends Item {
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public Sulfuras( int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }



    @Override
    protected void updateSellIn() {
    }

    @Override
    protected void updateQualityAfter() {

    }

    @Override
    protected void updateQuality() {

    }
}
