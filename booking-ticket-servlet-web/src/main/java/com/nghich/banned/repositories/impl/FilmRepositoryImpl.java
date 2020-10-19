package com.nghich.banned.repositories.impl;

import com.nghich.banned.entities.FilmModel;
import com.nghich.banned.base.helpers.json.JsonUtils;
import com.nghich.banned.base.helpers.json.JsonIOHelper;
import com.nghich.banned.repositories.FilmRepository;
import io.vertx.core.json.JsonObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilmRepositoryImpl implements FilmRepository {
    @Override
    public List<FilmModel> getShowingFilmHomepage() {
        List<FilmModel> result = new ArrayList<>();
        File file = JsonIOHelper.getFile("films", "showing-film.json");
        List<JsonObject> jsonObjects = JsonUtils.fileToListJsonObject(file);
        if (jsonObjects == null) {
            return null;
        }
        jsonObjects.forEach(item -> result.add(JsonUtils.jsonToObj(item, FilmModel.class)));
        return result;
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
