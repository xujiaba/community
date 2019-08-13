package com.zun.community.community.mapper;

import com.zun.community.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}