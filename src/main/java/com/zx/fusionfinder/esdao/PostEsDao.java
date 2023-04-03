package com.zx.fusionfinder.esdao;

import com.zx.fusionfinder.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    /**
     * 用户id搜索
     *
     * @param userId
     * @return
     */
    List<PostEsDTO> findByUserId(Long userId);

    /**
     * 帖子标题搜索
     *
     * @param title
     * @return
     */
    List<PostEsDTO> findByTitle(String title);
}