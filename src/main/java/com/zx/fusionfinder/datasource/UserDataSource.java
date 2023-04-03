package com.zx.fusionfinder.datasource;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.fusionfinder.model.dto.user.UserQueryRequest;
import com.zx.fusionfinder.model.vo.UserVO;
import com.zx.fusionfinder.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户服务实现类
 *
 * @Author Sakura
 * @date 2023/3/31
 * version 1.0
 **/
@Service
@Slf4j
public class UserDataSource implements DataSource<UserVO> {

    @Resource
    private UserService userService;

    @Override
    public Page<UserVO> doSearch(String searchText, long pageNum, long pageSize) {
        UserQueryRequest userQueryRequest = new UserQueryRequest();
        userQueryRequest.setUserName(searchText);
        userQueryRequest.setCurrent(pageNum);
        userQueryRequest.setPageSize(pageSize);
        Page<UserVO> userVOPage = userService.listUserVOByPage(userQueryRequest);
        return userVOPage;
    }
}
