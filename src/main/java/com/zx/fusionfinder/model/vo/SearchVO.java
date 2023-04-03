package com.zx.fusionfinder.model.vo;

import com.zx.fusionfinder.model.entity.Picture;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 聚合搜索
 *
 * @Author Sakura
 * @date 2023/3/30
 * version 1.0
 **/
@Data
public class SearchVO implements Serializable {

    private List<UserVO> userList;

    private List<PostVO> postList;

    private List<Picture> pictureList;

    private List<?> dataList;

    private static final long serialVersionUID = 1L;


}
