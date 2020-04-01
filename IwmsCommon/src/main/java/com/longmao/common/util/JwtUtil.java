package com.longmao.common.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
/**
 * @Author: wwivan
 * @Date: 2020/4/1日9:52
 * @Description: jwt工具类（包含生成签名，验证签名，获取签名内的信息）
 */
public class JwtUtil {
    /**
     * 过期时间为30分钟
     */
    private static final long EXPIRE_TIME = 30*60*1000;
    /**
     * jwt秘钥
     */
    private static final String SECRET = "jwt_secret";

    public static String sign(String userId) {
        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            return JWT.create()
                    // 将 user id 保存到 token 里面
                    .withAudience(userId)
                    // 五分钟后token过期
                    .withExpiresAt(date)
                    // token 的密钥
                    .sign(algorithm);
        } catch (Exception e) {
            return null;
        }
    }
    /**
     * 根据token获取userId
     * @param token
     * @return
     */
    public static String getUserId(String token) {
        try {
            String userId = JWT.decode(token).getAudience().get(0);
            return userId;
        } catch (JWTDecodeException e) {
            return null;
        }
    }
    /**
     * 校验token
     * @param token
     * @return
     */
    public static boolean checkSign(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTVerifier verifier = JWT.require(algorithm)
                    // .withClaim("username", username)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (JWTVerificationException exception) {
            throw new RuntimeException("token 无效，请重新获取");
        }
    }

}
