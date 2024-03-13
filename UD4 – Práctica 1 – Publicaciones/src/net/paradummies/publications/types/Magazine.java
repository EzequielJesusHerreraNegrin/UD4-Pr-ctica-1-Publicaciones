package net.paradummies.publications.types;
import java.time.LocalDate;

import net.paradummies.publications.Publication;

public class Magazine extends Publication{
    
    protected int magazineNumber;
    protected String[] listOfArticles;
    
    public Magazine(String title, int numberOfPages, int isbn, Float distributionPrice,
            String lastUpdate, int magazineNumber, String listofArticles) {
        super(title, numberOfPages, isbn, distributionPrice, lastUpdate);
        this.magazineNumber = magazineNumber;
        this.listOfArticles = articleCollector(listofArticles);
        }

    public int getMagazineNumber() {
        return magazineNumber;
    }

    public void setMagazineNumber(int magazineNumber) {
        this.magazineNumber = magazineNumber;
    }

    public String[] getListOfArticles() {
        return listOfArticles;
    }

    public void setListOfArticles(String[] listOfArticles) {
        this.listOfArticles = listOfArticles;
    }

    protected String[] articleCollector(String listOfArticles) {

        String[] arrSplit = listOfArticles.split("_");
        this.listOfArticles = arrSplit;
    
        return arrSplit;
    }

    protected String articlePrinter(){
        int articleCounter = 1;
        String articleString = "";

        for (String string : listOfArticles) {
            
            articleString += "\n\tArticulo "+articleCounter+": "+string;

            articleCounter++;
        }

        return articleString;
    }

    @Override
    public String toString() {

        return "\n--------------------------------------=== " + this.title + " ===----------------------------------\n" +
                "Numero de revista: " + this.magazineNumber+
                "\nLista de articulos: " +
                articlePrinter()+
                "\nPrecio de distribucion: "+this.distributionPrice+
                "\nPrecio de venta el publico: "+this.pvp+
                "\n===============================================================================================\n";
    }

}
