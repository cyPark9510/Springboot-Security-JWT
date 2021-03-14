package com.pcy.jwt.config.jwt;

public interface JwtProperties {
	String SECRET = "pcy"; // 우리 서버만 알고 있는 비밀 값
	int EXPIRATION_TIME = 60000 * 10;
	String TOKEN_PREFIX = "Bearer ";
	String HEADER_STRING = "Authorization";
}
