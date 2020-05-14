/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: PictureService
 * Author:   OneStar
 * Date:     2020/3/20 9:33
 * Description: 照片墙服务层接口
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.service;

import com.star.po.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈照片墙服务层接口〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/20
 * @since 1.0.0
 */
public interface PictureService {

    List<Picture> listPicture();

    Picture savePicture(Picture picture);

    Picture getPicture(Long id);

    Page<Picture> listPicture(Pageable pageable);

    Picture updatePicture(Long id,Picture picture);

    void deletePicture(Long id);
}