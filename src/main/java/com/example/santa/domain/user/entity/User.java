package com.example.santa.domain.user.entity;

import com.example.santa.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Embedded
    private Password password;

    private String name;

    private String nickname;

    private String phoneNumber;

    private String picture;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public User(String email, Password password, String name, String nickname, String phoneNumber, Role role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

}
