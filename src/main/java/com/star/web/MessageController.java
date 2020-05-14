package com.star.web;

import com.star.po.Comment;
import com.star.po.Message;
import com.star.po.User;
import com.star.service.BlogService;
import com.star.service.CommentService;
import com.star.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈留言板显示页面〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/2/20
 * @since 1.0.0
 */
@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Value("${message.avatar}")
    private String avatar;

//    显示留言页面
    @GetMapping("/message")
    public String message() {
        return "message";
    }


    @GetMapping("/messagecomment")
    public String messageComment(Model model){
        model.addAttribute("messages",messageService.listMessage());
        return "message::messageList";
    }

    @PostMapping("/message")
    public String post(Message message,HttpSession session){
        User user = (User) session.getAttribute("user");
        if (user != null) {
            message.setAvatar(user.getAvatar());
            message.setAdminComment(true);
        } else {
            message.setAvatar(avatar);
        }
        messageService.saveMessage(message);
        return "redirect:/messagecomment";
    }
}