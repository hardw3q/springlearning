package com.pixels.pixelsplus.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "users")
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

    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;
}
