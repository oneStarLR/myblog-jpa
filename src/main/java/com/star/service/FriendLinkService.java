/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: FriendLinkService
 * Author:   OneStar
 * Date:     2020/3/12 21:28
 * Description: 友链服务层接口
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.service;

import com.star.po.FriendLink;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈友链服务层接口〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/12
 * @since 1.0.0
 */
public interface FriendLinkService {

    List<FriendLink> listFriendlinks();

    FriendLink saveFriendLink(FriendLink friendLink);

    FriendLink getFriendLink(Long id);

    Page<FriendLink> listFriendLink(Pageable pageable);

    FriendLink updateFriendLink(Long id,FriendLink friendLink);

    void deleteFriendLink(Long id);

}