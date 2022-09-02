package com.gildedrose.entity;

import com.gildedrose.Item;

/**
 * @ClassName Backstage
 * @Description todo
 * @Author XDan
 * @Date 2022/9/2 0:39
 * @Version 1.0
 **/

public class Backstage extends Item {
    public Backstage(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public Backstage(int sellIn,int quality) {
         super("Backstage passes to a TAFKAL80ETC concert",sellIn,quality);
    }




    @Override
    protected void updateQualityAfter() {
        quality = 0;
    }

    @Override
    protected void updateQuality() {
        incrQuality();

            if (sellIn < 11) {
                incrQuality();
            }

            if (sellIn < 6) {
                incrQuality();
            }

//        }
    }

    private void incrQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
