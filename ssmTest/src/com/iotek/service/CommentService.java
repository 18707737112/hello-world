package com.iotek.service;

import com.iotek.model.Comment;

import java.util.List;

public interface CommentService {
    boolean addComment(Comment comment);
    boolean delComment(int id);
    boolean updateComment(Comment comment);
    Comment getIdComment(int id);
    List<Comment> getUserComment(int uid);
    List<Comment> getComment();
}
