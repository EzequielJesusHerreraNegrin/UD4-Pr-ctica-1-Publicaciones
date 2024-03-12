package net.Para_Dummies.Publicaciones.OtherPublications;

import java.time.LocalDate;

import net.Para_Dummies.Publicaciones.MainPublication.Publicacion;

public class Novela extends Publicacion {

    protected String[] topics = { "Novela Negra", "Novela historica", "Novela juvenil" };
    protected String author;

    public Novela(String title, int numberOfPages, int isbn, Float distributionPrice, Float pvp, LocalDate lastUpdate) {
        super(title, numberOfPages, isbn, distributionPrice, pvp, lastUpdate);
        this.topics = topics;
        this.author = author;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return;
    }

}
