package com.joker.bbiz.remote.impl;


import com.joker.bbiz.dao.BlogDao;
import com.joker.bremote.dto.Blog;
import com.joker.bremote.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shichao.liao on 15/5/30.
 */
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogDao blogDao;

    @Override
    public int addBlog(Blog blog) {
        return blogDao.addBlog(blog);
    }

    @Override
    public Blog loadBlog(int id) {
        return blogDao.loadBlog(id);
    }
}
