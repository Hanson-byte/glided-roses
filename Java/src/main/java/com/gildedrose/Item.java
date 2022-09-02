package com.gildedrose;

import com.gildedrose.entity.AgedBrie;
import com.gildedrose.entity.Backstage;
import com.gildedrose.entity.Normal;
import com.gildedrose.entity.Sulfuras;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }




   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }



     void passDay() {
         updateSellIn();
         updateQuality();

         if (isExpired()) {
             updateQualityAfter();
         }

    }



    protected void updateQuality() {
        decrAquality();

    }

    protected void updateQualityAfter() {
         decrAquality();
    }

    private void decrAquality() {
        if(quality>0){
            quality = quality - 1;
        }
    }


    private boolean isExpired() {
        return sellIn < 0;
    }


    protected void updateSellIn() {
        sellIn = sellIn - 1;

    }


}
