/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: FriendController
 * Author:   OneStar
 * Date:     2020/3/11 17:02
 * Description: 友链后台管理
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.web.admin;

import com.star.po.FriendLink;
import com.star.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈友链后台管理〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/11
 * @since 1.0.0
 */
@Controller
@RequestMapping("/admin")
public class FriendController {

    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friendlinks")
    public String friend(@PageableDefault(size = 10,sort = {"id"},direction = Sort.Direction.DESC)
                                     Pageable pageable, Model model){
        model.addAttribute("page",friendLinkService.listFriendLink(pageable));
        return "admin/friendlinks";
    }

    @GetMapping("/friendlinks/input")
    public String input(Model model) {
        model.addAttribute("friendlink", new FriendLink());
        return "admin/friendlinks-input";
    }

    @GetMapping("/friendlinks/{id}/input")
    public String editInput(@PathVariable Long id, Model model) {
        model.addAttribute("friendlink", friendLinkService.getFriendLink(id));
        return "admin/friendlinks-input";
    }

    @PostMapping("/friendlinks")
    public String post(@Valid FriendLink friendLink,BindingResult result,RedirectAttributes attributes){

        if(result.hasErrors()){
            return "admin/friendlinks-input";
        }
        friendLink.setCreateTime(new Date());
        FriendLink F = friendLinkService.saveFriendLink(friendLink);
        if (F == null ) {
            attributes.addFlashAttribute("message", "新增失败");
        } else {
            attributes.addFlashAttribute("message", "新增成功");
        }
        return "redirect:/admin/friendlinks";
    }

//    编辑友链
    @PostMapping("/friendlinks/{id}")
    public String editPost(@Valid FriendLink friendLink, BindingResult result, @PathVariable Long id, RedirectAttributes attributes) {
        friendLink.setCreateTime(new Date());
        FriendLink F = friendLinkService.updateFriendLink(id,friendLink);
        if (F == null ) {
            attributes.addFlashAttribute("message", "编辑失败");
        } else {
            attributes.addFlashAttribute("message", "编辑成功");
        }
        return "redirect:/admin/friendlinks";
    }

    @GetMapping("/friendlinks/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes){
        friendLinkService.deleteFriendLink(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/friendlinks";
    }
}