package com.example.santa.domain.challege.entity;

import com.example.santa.domain.category.entity.Category;
import com.example.santa.domain.common.BaseEntity;
import com.example.santa.domain.meeting.entity.MeetingTag;
import com.example.santa.domain.user.entity.User;
import com.example.santa.domain.userchallenge.entity.UserChallenge;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Entity
public class Challenge extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private  String name;

    @Column
    private String description;

    @Column
    @Size(max = 1000, message = "이미지명이 너무 깁니다(한글)")
    private String image;

    @Column
    private Integer clearStandard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "challenge", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserChallenge> userChallenges;

}
