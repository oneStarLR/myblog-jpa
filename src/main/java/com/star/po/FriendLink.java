/**
 * Copyright (C), 2015-2020, LSTAR
 * FileName: FriendLink
 * Author:   OneStar
 * Date:     2020/3/11 21:07
 * Description: 友链实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * oneStar           修改时间           版本号              描述
 */
package com.star.po;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈友链实体类〉
 *
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 * @create 2020/3/11
 * @since 1.0.0
 */
@Entity
@Table(name = "t_friend")
public class FriendLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "博客名称不能为空")
    private String blogname;
//    @NotBlank(message = "博客地址不能为空")
    private String blogaddress;
//    @NotBlank(message = "图片地址不能为空")
    private String pictureaddress;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public FriendLink() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FriendLink{" +
                "id=" + id +
                ", blogname='" + blogname + '\'' +
                ", blogaddress='" + blogaddress + '\'' +
                ", pictureaddress='" + pictureaddress + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}