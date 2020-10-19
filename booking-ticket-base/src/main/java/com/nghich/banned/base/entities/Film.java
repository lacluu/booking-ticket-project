package com.nghich.banned.base.entities;

import java.time.LocalDateTime;

public class Film extends AbstractEntity{
    private int filmDuration;
    private LocalDateTime publicDate;
    private String filmUrl;
    private int filmAge;
    private String filmLanguage;
    private double avgPoint;
    private String posterUrl;

    public Film() {
        super();
    }

    public Film(int filmDuration, LocalDateTime publicDate, String filmUrl, int filmAge, String filmLanguage, double avgPoint, String posterUrl) {
        super();
        this.filmDuration = filmDuration;
        this.publicDate = publicDate;
        this.filmUrl = filmUrl;
        this.filmAge = filmAge;
        this.filmLanguage = filmLanguage;
        this.avgPoint = avgPoint;
        this.posterUrl = posterUrl;
    }
}
