package com.example.santa.domain.user.service;

import com.example.santa.domain.user.dto.UserResponseDto;
import com.example.santa.domain.user.dto.UserSignInRequestDto;
import com.example.santa.domain.user.dto.UserSignupRequestDto;
import com.example.santa.domain.user.dto.UserUpdateRequestDto;
import com.example.santa.domain.user.entity.Password;
import com.example.santa.global.security.jwt.JwtToken;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    // create
    Long signup(UserSignupRequestDto request);
    // duplicate
    Boolean checkEmailDuplicate(String email);
    Boolean checkNicknameDuplicate(String nickname);
    // login
    JwtToken signIn(UserSignInRequestDto userSignInRequestDto);
    // read
    UserResponseDto findUserByEmail(String email);

    // Users read(관리자)
    Page<UserResponseDto> findAllUser(Pageable pageable);

    UserResponseDto updateUser(Long id, UserUpdateRequestDto userUpdateRequestDto);

    Long changePassword(Long id, String oldPassword, String newPassword);

}
