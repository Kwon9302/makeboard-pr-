package com.solo.boardPr.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {

    private static final SecretKey SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // JWT 생성
    public static String generateToken(String subject) {
        return Jwts.builder()
                .setSubject(subject) //jwt의 주체(사용자)를 설정
                .setIssuedAt(new Date()) // jwt 발행시간 설정
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1시간 유효기간 설정
                .signWith(SECRET_KEY) // 비밀키를 사용해서 jwt에 서명
                .compact(); // jwt를 직렬화하여 문자열로 반환
    }

    // JWT 검증
    public static boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // JWT에서 클레임 추출
    public static Claims getClaims(String token) {
        return Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token).getBody();
    }

    public static void main(String[] args) {
        String token = generateToken("user123");
        System.out.println("**** Generated Token ****: " + token);

        boolean isValid = validateToken(token);
        System.out.println("**** Is token valid? **** " + isValid);

        Claims claims = getClaims(token);
        System.out.println("**** Token claims: **** " + claims);
    }
}
