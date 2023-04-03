package com.zx.fusionfinder.controller;

import com.zx.fusionfinder.common.BaseResponse;
import com.zx.fusionfinder.common.ResultUtils;
import com.zx.fusionfinder.manager.SearchFacade;
import com.zx.fusionfinder.model.dto.search.SearchRequest;
import com.zx.fusionfinder.model.vo.SearchVO;
import com.zx.fusionfinder.service.PictureService;
import com.zx.fusionfinder.service.PostService;
import com.zx.fusionfinder.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 聚合搜索
 *
 * @Author Sakura
 * @date 2023/3/30
 * version 1.0
 **/
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }

}
