package com.zx.fusionfinder.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.fusionfinder.common.BaseResponse;
import com.zx.fusionfinder.common.ErrorCode;
import com.zx.fusionfinder.common.ResultUtils;
import com.zx.fusionfinder.exception.ThrowUtils;
import com.zx.fusionfinder.model.dto.picture.PictureQueryRequest;
import com.zx.fusionfinder.model.entity.Picture;
import com.zx.fusionfinder.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 * @Author Sakura
 * @date 2023/3/30
 * version 1.0
 **/
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Resource
    private PictureService pictureService;

    /**
     * 分页获取列表（封装类）
     *
     * @param pictureQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page/vo")
    public BaseResponse<Page<Picture>> listPictureByPage(@RequestBody PictureQueryRequest pictureQueryRequest,
                                                         HttpServletRequest request) {
        long current = pictureQueryRequest.getCurrent();
        long size = pictureQueryRequest.getPageSize();
        // 限制爬虫
        ThrowUtils.throwIf(size > 20, ErrorCode.PARAMS_ERROR);
        String searchText = pictureQueryRequest.getSearchText();
        Page<Picture> picturePage = pictureService.searchPicture(searchText, current, size);
        return ResultUtils.success(picturePage);
    }

}
