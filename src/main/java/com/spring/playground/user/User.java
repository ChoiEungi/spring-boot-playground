package com.spring.playground.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userEmail;

    private String userName;

    private String userPassword;

    private String userPhoneNumber;

    private String userNickname;


    public User(String userEmail, String userName, String userPassword, String userPhoneNumber, String userNickname) {
        this(null, userEmail, userName, userPassword, userPhoneNumber, userNickname);
    }

    private User(Long id, String userEmail, String userName, String userPassword, String userPhoneNumber, String userNickname) {
        this.id = id;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhoneNumber = userPhoneNumber;
        this.userNickname = userNickname;
    }
}
