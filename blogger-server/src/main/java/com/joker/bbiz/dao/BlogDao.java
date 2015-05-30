package com.joker.bbiz.dao;

import com.joker.bremote.dto.Blog;

/**
 * Created by shichao.liao on 15/5/22.
 */
public interface BlogDao {

    public int addBlog(Blog blog);
    public Blog loadBlog(int id);
}
