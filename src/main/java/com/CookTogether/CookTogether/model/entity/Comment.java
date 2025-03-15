package com.CookTogether.CookTogether.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment extends BaseEntity {

    private String content;

    @Column(name = "date_posted")
    private LocalDateTime datePosted;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private Recipe recipe;

}
