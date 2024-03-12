package net.Para_Dummies.Publicaciones.OtherPublications;

import java.time.LocalDate;

import net.Para_Dummies.Publicaciones.MainPublication.Publicacion;

public class LibroDeTexto extends Publicacion {

    protected String subject;
    protected String[] chaptersName;

    public LibroDeTexto(String title, int numberOfPages, int isbn, Float distributionPrice, Float pvp,
            LocalDate lastUpdate) {
        super(title, numberOfPages, isbn, distributionPrice, pvp, lastUpdate);

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

}
