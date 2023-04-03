package com.zx.fusionfinder.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Component;

/**
 * @Author Sakura
 * @date 2023/3/31
 * version 1.0
 **/
@Component
public class VideoDataSource implements DataSource<Object>{
    @Override
    public Page<Object> doSearch(String searchText, long pageNum, long pageSize) {
        return null;
    }
}
