package com.joker.bremote.service;

import com.joker.bremote.dto.Blog;

/**
 * Created by shichao.liao on 15/5/30.
 */
public interface BlogService {
    public int addBlog(Blog blog);
    public Blog loadBlog(int id);
}
