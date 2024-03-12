package net.Para_Dummies.Publicaciones.OtherPublications;
import java.time.LocalDate;

import net.Para_Dummies.Publicaciones.MainPublication.Publicacion;

public class Revista extends Publicacion{
    
    protected int magazineNumber;
    protected String[] listOfArticles;
    
    public Revista(String title, int numberOfPages, int isbn, Float distributionPrice, Float pvp,
            LocalDate lastUpdate) {
        super(title, numberOfPages, isbn, distributionPrice, pvp, lastUpdate);
        this.magazineNumber = magazineNumber;
        this.listOfArticles = listOfArticles;
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

}
