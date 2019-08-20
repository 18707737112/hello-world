package com.iotek.service;

import com.iotek.dao.CommentDao;
import com.iotek.model.Comment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentDao commentDao;

    @Override
    public boolean addComment(Comment comment) {
        return commentDao.addComment(comment);
    }

    @Override
    public boolean delComment(int id) {
        return commentDao.delComment(id);
    }

    @Override
    public boolean updateComment(Comment comment) {
        return commentDao.updateComment(comment);
    }

    @Override
    public Comment getIdComment(int id) {
        return commentDao.getIdComment(id);
    }

    @Override
    public List<Comment> getUserComment(int uid) {
        return commentDao.getUserComment(uid);
    }

    @Override
    public List<Comment> getComment() {
        return commentDao.getComment();
    }
}
