/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: MessageRepository
 * Author:   OneStar
 * Date:     2020/3/5 22:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.dao;

import com.star.po.Message;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/5
 * @since 1.0.0
 */
public interface MessageRepository extends JpaRepository<Message, Long> {

//    List<Message> findByParentMessageNull();
    List<Message> findAllByParentMessageNull(Sort Sort);
}