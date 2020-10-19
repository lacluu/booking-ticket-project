package com.nghich.banned.repositories;

import com.nghich.banned.entities.FilmModel;

import java.util.List;

public interface FilmRepository {
    List<FilmModel> getShowingFilmHomepage();
    List<FilmModel> getComingSoonFilmHomepage();
    List<FilmModel> getFilmByCinemaId(Long cinemaId);
}
