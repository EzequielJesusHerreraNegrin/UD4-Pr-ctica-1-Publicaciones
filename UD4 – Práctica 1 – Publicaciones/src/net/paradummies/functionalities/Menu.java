package net.paradummies.functionalities;

import java.util.Scanner;

import net.paradummies.publications.Publication;
import net.paradummies.publications.types.Magazine;
import net.paradummies.publications.types.Novel;
import net.paradummies.publications.types.TextBook;

public class Menu {

    public Menu() {
    }

    public Magazine addNewMagazine(String magazineInfo) {
        String[] arrSplit = magazineInfo.split(", ");

        int numberOfpagesCast = Integer.parseInt(arrSplit[1]);
        int isbnCast = Integer.parseInt(arrSplit[2]);
        float distributionPriceCast = Float.parseFloat(arrSplit[3]);
        int magazineNumberCast = Integer.parseInt(arrSplit[5]);

        Magazine magazine = new Magazine(arrSplit[0], numberOfpagesCast, isbnCast, distributionPriceCast, arrSplit[4],
                magazineNumberCast, arrSplit[6]);

        return magazine;
    }

    public TextBook addNewTextBook(String textBookinfo) {
        String[] arrSplit = textBookinfo.split(", ");

        int numberOfpagesCast = Integer.parseInt(arrSplit[1]);
        int isbnCast = Integer.parseInt(arrSplit[2]);
        float distributionPriceCast = Float.parseFloat(arrSplit[3]);

        TextBook textBook = new TextBook(arrSplit[0], numberOfpagesCast, isbnCast, distributionPriceCast, arrSplit[4], arrSplit[5], arrSplit[6]);

        return textBook;
    }

    public Novel addNewNovel(String novelInfo) {
        String[] arrSplit = novelInfo.split(", ");

        int numberOfpagesCast = Integer.parseInt(arrSplit[1]);
        int isbnCast = Integer.parseInt(arrSplit[2]);
        float distributionPriceCast = Float.parseFloat(arrSplit[3]);
        int topicCast = Integer.parseInt(arrSplit[5]);

        Novel novel = new Novel(arrSplit[0], numberOfpagesCast, isbnCast, distributionPriceCast, arrSplit[4], topicCast, arrSplit[6]);

        return novel;
    }

}
