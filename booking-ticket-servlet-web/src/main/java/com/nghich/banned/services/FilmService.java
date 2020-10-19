package com.nghich.banned.services;

import com.nghich.banned.entities.FilmModel;

import java.util.List;

public interface FilmService {
    List<FilmModel> getShowingFilmHomepage();
    List<FilmModel> getComingSoonFilmHomepage();
    List<FilmModel> getFilmByCinemaId(Long cinemaId);
}
