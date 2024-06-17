package com.pixels.pixelsplus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Subscription {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "subscription")
    private List<User> users;
}
