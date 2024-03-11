package net.Para_Dummies;

import java.time.LocalDate;

public class Publicacion {

    protected String title;
    protected int numberOfPages;
    protected int isbn = 0;
    protected double distributionPrice;
    protected double pvp;
    protected LocalDate lastUpdate;

    public Publicacion(String title, int numberOfPages, int isbn, double distributionPrice, double pvp,
            LocalDate lastUpdate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
        this.distributionPrice = distributionPrice;
        this.pvp = pvp;
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

    public double getDistributionPrice() {
        return distributionPrice;
    }

    public void setDistributionPrice(double distributionPrice) {
        this.distributionPrice = distributionPrice;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
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

}
