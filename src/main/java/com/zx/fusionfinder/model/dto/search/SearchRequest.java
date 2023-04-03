package com.zx.fusionfinder.model.dto.search;

import com.zx.fusionfinder.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Author Sakura
 * @date 2023/3/30
 * version 1.0
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 类型
     */
    private String type;

    private static final long serialVersionUID = 1L;

}
