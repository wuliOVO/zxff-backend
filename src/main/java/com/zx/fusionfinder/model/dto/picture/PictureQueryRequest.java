package com.zx.fusionfinder.model.dto.picture;

import com.zx.fusionfinder.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @Author Sakura
 * @date 2023/3/30
 * version 1.0
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class PictureQueryRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    private static final long serialVersionUID = 1L;

}
