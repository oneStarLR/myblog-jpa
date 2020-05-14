/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: FriendLinkServiceImpl
 * Author:   OneStar
 * Date:     2020/3/12 21:37
 * Description: 友链接口实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.service;

import com.star.NotFoundException;
import com.star.dao.FriendLinkRespository;
import com.star.po.FriendLink;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈友链接口实现类〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/12
 * @since 1.0.0
 */
@Service
public class FriendLinkServiceImpl implements FriendLinkService {

    @Autowired
    private FriendLinkRespository friendLinkRespository;

    @Transactional
    @Override
    public List<FriendLink> listFriendlinks() {
        return friendLinkRespository.findAll();
    }

    @Transactional
    @Override
    public FriendLink saveFriendLink(FriendLink friendLink) {
        return friendLinkRespository.save(friendLink);
    }

    @Transactional
    @Override
    public FriendLink getFriendLink(Long id) {
        return friendLinkRespository.findOne(id);
    }

    @Transactional
    @Override
    public Page<FriendLink> listFriendLink(Pageable pageable) {
//        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        return friendLinkRespository.findAll(pageable);
    }

    @Transactional
    @Override
    public FriendLink updateFriendLink(Long id, FriendLink friendLink) {
        FriendLink F = friendLinkRespository.findOne(id);
        if(F == null){
            throw new NotFoundException("不存在该友链");
        }
        BeanUtils.copyProperties(friendLink,F);
        return friendLinkRespository.save(F);
    }

    @Transactional
    @Override
    public void deleteFriendLink(Long id) {
        friendLinkRespository.delete(id);
    }
}