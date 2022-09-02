package com.gildedrose;

import com.gildedrose.entity.AgedBrie;
import com.gildedrose.entity.Backstage;
import com.gildedrose.entity.Normal;
import com.gildedrose.entity.Sulfuras;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.gildedrose.Item.*;

public class TexttestFixture {
    public static void main(String[] args) {
        String outLine = getLine();
        System.out.println(outLine);

    }


    public static String getLine() {
        //        System.out.println("OMGHAI!");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");
        Item[] items = new Item[] {
                new Normal("+5 Dexterity Vest", 10, 20), //
                new AgedBrie( 2, 0), //
                new Normal("Elixir of the Mongoose", 5, 7), //
                new Sulfuras( 0, 80), //
                new Sulfuras( -1, 80),
                new Backstage( 12, 20),
                new Backstage( 10, 49),
                new Backstage(5, 49),
                // this conjured item does not work properly yet
                new Normal("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
//        if (args.length > 0) {
//            days = Integer.parseInt(args[0]) + 1;
//        }

        for (int i = 0; i < days; i++) {
//            System.out.println("-------- day " + i + " --------");
//            System.out.println("name, sellIn, quality");
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
//                System.out.println(item);
                printStream.println(item);
            }
//            System.out.println();
            printStream.println();
            app.updateQuality();

        }
        String outLine = out.toString();
        return outLine;
    }

}
