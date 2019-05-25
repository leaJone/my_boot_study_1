package com.xxmy.boot.neteasy_one.token;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;


/**
 * @author MAIBENBEN
 */
public class TokenProvider {

    SecretKeySpec key;


    public TokenProvider(String sign) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(sign.getBytes(), SignatureAlgorithm.HS512.getJcaName());
        this.key = secretKeySpec;

    }

    /**
     * @param claims
     * @return
     */
    public String createToken(Claims claims) {
        return Jwts.builder().setClaims(claims)
                .compressWith(CompressionCodecs.DEFLATE)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
    }


    /**
     * @param token
     * @return
     */
    public Claims parseToken(String token) {

        Claims body = null;
        try {
            Jwts.parser().setSigningKey(key)
                    .parseClaimsJws(token).getBody();
        } catch (Exception e) {
            System.out.println(e);
        }
        return body;
    }
}
