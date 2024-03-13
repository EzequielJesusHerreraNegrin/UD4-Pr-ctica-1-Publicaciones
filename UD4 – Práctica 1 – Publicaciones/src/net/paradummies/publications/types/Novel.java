package net.paradummies.publications.types;

import net.paradummies.publications.Publication;

public class Novel extends Publication {

    protected final String[] TOPICS = { "Novela Negra", "Novela historica", "Novela juvenil" };
    protected String booktopic;
    protected String author;

    public Novel(String title, int numberOfPages, int isbn, float distributionPrice, String lastUpdate, String bookTopic,
            String author) {
        super(title, numberOfPages, isbn, distributionPrice, lastUpdate);
        this.author = author;
        this.booktopic = bookTopic;
    }

    public String[] getTOPICS() {
        return TOPICS;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {

        return "\n--------------------------------------=== " + this.title + " ===----------------------------------\n"
                +
                "Tematica: " + this.booktopic +
                "\nAutor: " + this.author +
                "\nNumero de paginas: " + this.numberOfPages +
                "\nPrecio de distribucion: " + this.distributionPrice +
                "\nPrecio de venta el publico: " + this.pvp +
                "\n===============================================================================================\n";
    }

}
