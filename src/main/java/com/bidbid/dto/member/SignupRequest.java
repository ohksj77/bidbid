package com.bidbid.dto.member;

import com.bidbid.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Setter
    private String password;
    @NotEmpty
    private String name;

    public Member toEntity() {
        return Member.builder()
                .email(email)
                .name(name)
                .password(password)
                .build();
    }
}