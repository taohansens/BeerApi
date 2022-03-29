package com.taohansen.clientscrud.dto;

import com.taohansen.clientscrud.entities.Beer;

import java.io.Serializable;

public class BeerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;

    private String name;
    private String imgUrl;
    private String description;
    private String fermentation;
    private Integer ibu;
    private Integer calories;
    private Double carbs;

    public BeerDTO() {
    }

    public BeerDTO(long id, String name, String imgUrl, String description, String fermentation, Integer ibu, Integer calories, Double carbs) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.description = description;
        this.fermentation = fermentation;
        this.ibu = ibu;
        this.calories = calories;
        this.carbs = carbs;
    }

    public BeerDTO(Beer entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.imgUrl = entity.getImgUrl();
        this.description= entity.getDescription();
        this.fermentation = entity.getFermentation();
        this.ibu = entity.getIbu();
        this.calories = entity.getCalories();
        this.carbs = entity.getCarbs();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFermentation() {
        return fermentation;
    }

    public void setFermentation(String fermentation) {
        this.fermentation = fermentation;
    }

    public Integer getIbu() {
        return ibu;
    }

    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Double getCarbs() {
        return carbs;
    }

    public void setCarbs(Double carbs) {
        this.carbs = carbs;
    }
}
