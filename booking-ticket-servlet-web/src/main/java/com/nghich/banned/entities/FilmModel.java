package com.nghich.banned.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilmModel {

    @JsonProperty("film_id")
    public Integer filmId;
    @JsonProperty("film_name")
    public String filmName;
    @JsonProperty("film_name_vn")
    public String filmNameVn;
    @JsonProperty("film_name_en")
    public String filmNameEn;
    @JsonProperty("film_duration")
    public Integer filmDuration;
    @JsonProperty("publish_date")
    public String publishDate;
    @JsonProperty("pg_rating")
    public String pgRating;
    @JsonProperty("status_id")
    public Integer statusId;
    @JsonProperty("type_id")
    public Integer typeId;
    @JsonProperty("media_id")
    public String mediaId;
    @JsonProperty("film_url")
    public String filmUrl;
    @JsonProperty("is_new")
    public Integer isNew;
    @JsonProperty("film_age")
    public Integer filmAge;
    @JsonProperty("film_slug")
    public String filmSlug;
    @JsonProperty("film_version")
    public String filmVersion;
    @JsonProperty("film_language")
    public String filmLanguage;
    @JsonProperty("count_like")
    public String countLike;
    @JsonProperty("count_share")
    public String countShare;
    @JsonProperty("count_comment")
    public String countComment;
    @JsonProperty("has_session")
    public Integer hasSession;
    @JsonProperty("total_rating")
    public Integer totalRating;
    @JsonProperty("avg_point")
    public Double avgPoint;
    @JsonProperty("avg_point_all")
    public Double avgPointAll;
    @JsonProperty("avg_point_showing")
    public Double avgPointShowing;
    @JsonProperty("imdb_point")
    public Integer imdbPoint;
    @JsonProperty("showing_date")
    public String showingDate;
    @JsonProperty("film_slug_new")
    public String filmSlugNew;
    @JsonProperty("poster_url")
    public String posterUrl;
    @JsonProperty("poster_thumb")
    public String posterThumb;
    @JsonProperty("poster_landscape")
    public String posterLandscape;
    @JsonProperty("poster_landscape_mobile")
    public String posterLandscapeMobile;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmNameVn() {
        return filmNameVn;
    }

    public void setFilmNameVn(String filmNameVn) {
        this.filmNameVn = filmNameVn;
    }

    public String getFilmNameEn() {
        return filmNameEn;
    }

    public void setFilmNameEn(String filmNameEn) {
        this.filmNameEn = filmNameEn;
    }

    public Integer getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(Integer filmDuration) {
        this.filmDuration = filmDuration;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPgRating() {
        return pgRating;
    }

    public void setPgRating(String pgRating) {
        this.pgRating = pgRating;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFilmUrl() {
        return filmUrl;
    }

    public void setFilmUrl(String filmUrl) {
        this.filmUrl = filmUrl;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getFilmAge() {
        return filmAge;
    }

    public void setFilmAge(Integer filmAge) {
        this.filmAge = filmAge;
    }

    public String getFilmSlug() {
        return filmSlug;
    }

    public void setFilmSlug(String filmSlug) {
        this.filmSlug = filmSlug;
    }

    public String getFilmVersion() {
        return filmVersion;
    }

    public void setFilmVersion(String filmVersion) {
        this.filmVersion = filmVersion;
    }

    public String getFilmLanguage() {
        return filmLanguage;
    }

    public void setFilmLanguage(String filmLanguage) {
        this.filmLanguage = filmLanguage;
    }

    public String getCountLike() {
        return countLike;
    }

    public void setCountLike(String countLike) {
        this.countLike = countLike;
    }

    public String getCountShare() {
        return countShare;
    }

    public void setCountShare(String countShare) {
        this.countShare = countShare;
    }

    public String getCountComment() {
        return countComment;
    }

    public void setCountComment(String countComment) {
        this.countComment = countComment;
    }

    public Integer getHasSession() {
        return hasSession;
    }

    public void setHasSession(Integer hasSession) {
        this.hasSession = hasSession;
    }

    public Integer getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Integer totalRating) {
        this.totalRating = totalRating;
    }

    public Double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(Double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Double getAvgPointAll() {
        return avgPointAll;
    }

    public void setAvgPointAll(Double avgPointAll) {
        this.avgPointAll = avgPointAll;
    }

    public Double getAvgPointShowing() {
        return avgPointShowing;
    }

    public void setAvgPointShowing(Double avgPointShowing) {
        this.avgPointShowing = avgPointShowing;
    }

    public Integer getImdbPoint() {
        return imdbPoint;
    }

    public void setImdbPoint(Integer imdbPoint) {
        this.imdbPoint = imdbPoint;
    }

    public String getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(String showingDate) {
        this.showingDate = showingDate;
    }

    public String getFilmSlugNew() {
        return filmSlugNew;
    }

    public void setFilmSlugNew(String filmSlugNew) {
        this.filmSlugNew = filmSlugNew;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getPosterThumb() {
        return posterThumb;
    }

    public void setPosterThumb(String posterThumb) {
        this.posterThumb = posterThumb;
    }

    public String getPosterLandscape() {
        return posterLandscape;
    }

    public void setPosterLandscape(String posterLandscape) {
        this.posterLandscape = posterLandscape;
    }

    public String getPosterLandscapeMobile() {
        return posterLandscapeMobile;
    }

    public void setPosterLandscapeMobile(String posterLandscapeMobile) {
        this.posterLandscapeMobile = posterLandscapeMobile;
    }
}
