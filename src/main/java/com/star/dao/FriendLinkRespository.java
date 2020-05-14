/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: FriendLinkRespository
 * Author:   OneStar
 * Date:     2020/3/12 21:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.dao;

import com.star.po.FriendLink;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/12
 * @since 1.0.0
 */
public interface FriendLinkRespository extends JpaRepository<FriendLink,Long> {

    FriendLink findByBlogname(String blogname);
}