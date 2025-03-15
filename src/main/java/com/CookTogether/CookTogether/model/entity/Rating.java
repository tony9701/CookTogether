package com.CookTogether.CookTogether.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Rating extends BaseEntity {

    private int rating;

    @OneToOne
    private UserEntity user;

    @ManyToOne
    private Recipe recipe;


}
