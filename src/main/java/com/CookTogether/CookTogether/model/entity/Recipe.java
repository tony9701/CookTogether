package com.CookTogether.CookTogether.model.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Recipe extends BaseEntity {

    private String name;

    private String description;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Photo> pictures;

    private String ingredients;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private List<Category> categories;

    private String  cookingTime;

    private String  preparationTime;

    private DifficultyEnum difficulty;

    private int portions;

    private List<Comment> comments;

    private List<Rating> ratings;
}
