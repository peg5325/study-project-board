package com.study.studyprojectboard.service;

import com.study.studyprojectboard.domain.type.SearchType;
import com.study.studyprojectboard.dto.ArticleDto;
import com.study.studyprojectboard.dto.ArticleUpdateDto;
import com.study.studyprojectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String searchKeyword) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {

    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {

    }

    public void deleteArticle(long articleId) {

    }
}
