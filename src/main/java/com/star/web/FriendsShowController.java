/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: FriendsShowController
 * Author:   OneStar
 * Date:     2020/2/23 16:18
 * Description: 友人帐页面
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.web;

import com.star.dao.FriendLinkRespository;
import com.star.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈友人帐页面〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/2/23
 * @since 1.0.0
 */
@Controller
public class FriendsShowController {

    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model) {
        model.addAttribute("friendlinks",friendLinkService.listFriendlinks());
        return "friends";
    }
}