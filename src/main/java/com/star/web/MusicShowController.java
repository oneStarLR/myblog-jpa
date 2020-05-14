/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: MusicShowController
 * Author:   OneStar
 * Date:     2020/2/21 16:33
 * Description: 音乐盒界面显示
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈音乐盒界面显示〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/2/21
 * @since 1.0.0
 */
@Controller
public class MusicShowController {
    @GetMapping("/music")
    public String about() {
        return "music";
    }
}