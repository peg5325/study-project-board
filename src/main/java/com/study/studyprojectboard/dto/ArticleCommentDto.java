package com.study.studyprojectboard.dto;

import java.time.LocalDateTime;

public record ArticleCommentDto(
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime modifiedAt,
        String modifiedBy,
        String comment
) {
    public static ArticleCommentDto of(LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy, String comment) {
        return new ArticleCommentDto(createdAt, createdBy, modifiedAt, modifiedBy, comment);
    }
}
