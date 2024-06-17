package com.pixels.pixelsplus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Community {
    @Id
    @GeneratedValue
    private Long id;
}
