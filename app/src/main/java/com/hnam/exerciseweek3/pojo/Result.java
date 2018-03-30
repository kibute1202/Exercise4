
package com.hnam.exerciseweek3.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

@Parcel
public class Result {

    @SerializedName("vote_count")
    @Expose
    protected int voteCount;
    @SerializedName("id")
    @Expose
    protected int id;
    @SerializedName("video")
    @Expose
    protected Boolean video;
    @SerializedName("vote_average")
    @Expose
    protected float voteAverage;
    @SerializedName("title")
    @Expose
    protected String title;
    @SerializedName("popularity")
    @Expose
    protected double popularity;
    @SerializedName("poster_path")
    @Expose
    protected String posterPath;
    @SerializedName("original_language")
    @Expose
    protected String originalLanguage;
    @SerializedName("original_title")
    @Expose
    protected String originalTitle;
    @SerializedName("genre_ids")
    @Expose
    protected List<Integer> genreIds = null;
    @SerializedName("backdrop_path")
    @Expose
    protected String backdropPath;
    @SerializedName("adult")
    @Expose
    protected Boolean adult;
    @SerializedName("overview")
    @Expose
    protected String overview;
    @SerializedName("release_date")
    @Expose
    protected String releaseDate;

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer>  genreIds) {
        this.genreIds = genreIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
