package com.likelion.news.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginResponse {

    private String uid;
    private String accessToken;

}
