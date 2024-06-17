package com.pixels.pixelsplus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String username;
    @Column
    private String firstname;
    @Column
    private String secondname;
    @Column
    private String patronymic;
    @Column
    private int balance;
    @Column
    private String phone;
    @Column
    private String telegramID;

}
