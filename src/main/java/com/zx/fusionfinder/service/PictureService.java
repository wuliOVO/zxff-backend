package com.zx.fusionfinder.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.fusionfinder.model.entity.Picture;

/**
 * 图片服务
 *
 * @Author Sakura
 * @date 2023/3/30
 * version 1.0
 **/
public interface PictureService {

    Page<Picture> searchPicture(String searchText,long pageNum,long pageSize);
}
