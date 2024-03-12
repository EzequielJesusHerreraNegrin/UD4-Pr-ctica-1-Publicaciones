package net.paradummies.publications.types;

import net.paradummies.publications.Publication;

public class TextBook extends Publication {
    
    protected String subject;
    protected String[] chaptersName;
    
    public TextBook(String title, int numberOfPages, int isbn, float distributionPrice, String lastUpdate, String subject, String chaptersName
            ) {
        super(title, numberOfPages, isbn, distributionPrice, lastUpdate);
        this.subject = subject;
        this.chaptersName = chapterCollector(chaptersName);
        }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String[] getChaptersName() {
        return chaptersName;
    }

    public void setChaptersName(String[] chaptersName) {
        this.chaptersName = chaptersName;
    }

    protected String[] chapterCollector(String chaptersName) {

        String[] arrSplit = chaptersName.split(", ");
        this.chaptersName = arrSplit;
    
        return arrSplit;
    }

    protected String chapterPrinter(){
        int chapterCounter = 1;
        String chapterString = "";

        for (String string : chaptersName) {
            
            chapterString += "\n\tTema "+chapterCounter+": "+string;

            chapterCounter++;
        }

        return chapterString;
    }

    @Override
    public String toString(){
        return "--------------------------------------=== " + this.title + " ===----------------------------------\n" +
        "Asignatura: " + this.subject+
        "\nLista de temas: " +
        chapterPrinter()+
        "\nPrecio de distribucion: "+this.distributionPrice+
        "\nPrecio de venta el publico: "+this.pvp+
        "\n===============================================================================================";
    }

}
