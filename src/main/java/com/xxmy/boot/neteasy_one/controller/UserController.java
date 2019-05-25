package com.xxmy.boot.neteasy_one.controller;

/**
 * @Title: BaseController.java
 * @Package com.xxmy.boot.neteasy_one.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author LiJing
 * @date 2019/4/25 15:16
 * @version v.3.0
 */

import com.xxmy.boot.neteasy_one.dto.RspDTO;
import com.xxmy.boot.neteasy_one.entity.User;
import com.xxmy.boot.neteasy_one.token.TokenProvider;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author LiJing
 * @ClassName: BaseController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/4/25 15:16
 */
@RestController
@RequestMapping("user/")
public class UserController {

    TokenProvider tokenProvider = new TokenProvider("sign");

    @RequestMapping("/get")
    public RspDTO<User> index(String token) {

        RspDTO<User> resp = new RspDTO<>();
        Claims claims = tokenProvider.parseToken(token);
        if (claims.get("userId").equals("1")) {
            User user = new User();
            user.setId(88L);
            user.setName("萝莉");
            user.setAge(13);
            user.setSex(false);
            resp.setData(user);
            resp.setCode(200);
            resp.setMsg("成功");
        } else {

            resp.setCode(500);
            resp.setMsg("失败");
        }
        return resp;
    }

    @PostMapping("/login")
    public String login(String userName, String password) {
        if ("tony".equals(userName) && "123456".equals(password)) {

            DefaultClaims userinfo = new DefaultClaims();
            userinfo.put("userId", "1");
            userinfo.put("userName", "tony");
            userinfo.setId(UUID.randomUUID().toString());
            String token = tokenProvider.createToken(userinfo);
            return token;
        }
        return "登录失败";
    }
}
