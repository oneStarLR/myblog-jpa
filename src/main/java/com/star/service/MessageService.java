/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: MessageService
 * Author:   OneStar
 * Date:     2020/3/5 22:48
 * Description: 留言接口
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.service;

import com.star.po.Message;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈留言接口〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/5
 * @since 1.0.0
 */
public interface MessageService {
    List<Message> listMessage();
    Message saveMessage(Message message);
}