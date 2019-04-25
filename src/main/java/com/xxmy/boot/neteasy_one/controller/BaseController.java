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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiJing
 * @ClassName: BaseController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/4/25 15:16
 */
@RestController
@RequestMapping("base/")
public class BaseController {

    @GetMapping("/get")
    public RspDTO<User> index() {
        User user = new User();
        RspDTO<User> resp = new RspDTO<>();
        user.setId(88L);
        user.setName("萝莉");
        user.setAge(13);
        user.setSex(false);
        resp.setData(user);
        resp.setCode(200);
        resp.setMsg("成功");
        return resp ;
    }
}
