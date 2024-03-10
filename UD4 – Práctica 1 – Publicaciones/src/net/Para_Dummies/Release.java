package net.Para_Dummies;

public class Release {

    protected String title;
    protected int numberOfPages;
    protected final int ISBN = 0; 
    protected String distributionPrice;
    protected String pvp;
    protected String lastUpdate;
    
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
    public String getDistributionPrice() {
        return distributionPrice;
    }
    public void setDistributionPrice(String distributionPrice) {
        this.distributionPrice = distributionPrice;
    }
    public String getPvp() {
        return pvp;
    }
    public void setPvp(String pvp) {
        this.pvp = pvp;
    }
    public String getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }



}
