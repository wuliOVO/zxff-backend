package com.zx.fusionfinder.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 数据源接口
 *
 * @Author Sakura
 * @date 2023/3/31
 * version 1.0
 **/
public interface DataSource<T> {

    /**
     * 搜索
     *
     * @param searchText
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<T> doSearch(String searchText,long pageNum,long pageSize);
}
