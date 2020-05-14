/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: PictureShowController
 * Author:   OneStar
 * Date:     2020/3/15 14:15
 * Description: 照片墙显示控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.web;

import com.star.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈照片墙显示控制器〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/15
 * @since 1.0.0
 */
@Controller
public class PictureShowController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String picture(Model model){
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }

}