package net.paradummies.publications;

import java.time.LocalDate;

public class Publication {

    protected String title;
    protected int numberOfPages;
    protected int isbn = 0;
    protected float distributionPrice;
    protected float pvp;
    protected LocalDate lastUpdate;
    protected static Publication[] companyBackup = new Publication[100];

    public Publication() {
    }

    public Publication(String title, int numberOfPages, int isbn, float distributionPrice,
            String lastUpdate2) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.isbn = validatorOfISBN(isbn);
        this.distributionPrice = distributionPrice;
        this.pvp = distributionPrice + 5;
        this.lastUpdate = dateBiulder(lastUpdate2);
    }

    public Publication(float distributionPrice){
        this.distributionPrice = distributionPrice;
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

    public void setPvp(float pvp) {
        this.pvp = this.distributionPrice + 5;
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

    protected LocalDate dateBiulder(String date) {

        String[] arrSplit = date.split("/");
        int day = Integer.parseInt(arrSplit[2]);
        int month = Integer.parseInt(arrSplit[1]);
        int year = Integer.parseInt(arrSplit[0]);
        return LocalDate.of(year, month, day);
    }

    public int validatorOfISBN(int isbn) {
        int validatedISBN = 0;

        for (Publication publication : companyBackup) {

            if (publication != null) {
                if (publication.getIsbn() == isbn) {

                    System.out.println("ERROR: ese codigo ya esta asignado, por favor inserte otra secuencia.");
                    validatedISBN = 0;
                }else{
                    validatedISBN = isbn;
                }

            } else{
                validatedISBN = isbn;
                break;
            }

        }

        return validatedISBN;
    }

    public static void safePublication(Publication publication){

        int index = publication.getIsbn();
        companyBackup[index] = publication;
    
    }

    public static void showAllPublications(){

        for (Publication publication : companyBackup) {
        
            if (publication != null) {
                System.out.println(publication);
            
            }
        }
    }

}
