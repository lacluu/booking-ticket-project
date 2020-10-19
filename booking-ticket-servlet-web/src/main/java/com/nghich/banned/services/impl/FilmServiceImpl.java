package com.nghich.banned.services.impl;

import com.nghich.banned.entities.FilmModel;
import com.nghich.banned.repositories.FilmRepository;
import com.nghich.banned.services.FilmService;

import java.util.List;

public class FilmServiceImpl implements FilmService {

    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<FilmModel> getShowingFilmHomepage() {
        return filmRepository.getShowingFilmHomepage();
    }

    @Override
    public List<FilmModel> getComingSoonFilmHomepage() {
        return null;
    }

    @Override
    public List<FilmModel> getFilmByCinemaId(Long cinemaId) {
        return null;
    }
}
