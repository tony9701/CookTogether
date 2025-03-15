package com.CookTogether.CookTogether.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Category extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipe = new ArrayList<>();

}
