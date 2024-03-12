package net.Para_Dummies.Publicaciones.MainPublication;

import java.time.LocalDate;

public class Publicacion {

    protected String title;
    protected int numberOfPages;
    protected int isbn = 0;
    protected float distributionPrice;
    protected float pvp;
    protected LocalDate lastUpdate;

    public Publicacion(String title, int numberOfPages, int isbn, float distributionPrice,
    LocalDate lastUpdate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
        this.distributionPrice = distributionPrice;
        this.lastUpdate = lastUpdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getDistributionPrice() {
        return distributionPrice;
    }

    public void setDistributionPrice(float distributionPrice) {
        this.distributionPrice = distributionPrice;
    }

    public float getPvp() {
        return pvp;
    }


    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return """
                
                """;
    }

}
