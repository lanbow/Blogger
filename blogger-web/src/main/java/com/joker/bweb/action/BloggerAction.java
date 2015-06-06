package com.joker.bweb.action;

import com.joker.bremote.dto.Blog;
import com.joker.bremote.service.BlogService;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by shichao.liao on 15/6/6.
 */
public class BloggerAction {

    @Getter
    @Setter
    private BlogService blogService;

    @Getter
    @Setter
    private Blog blog;

    @Getter
    @Setter
    private int blogId;

    public String execute(){
        blog= blogService.loadBlog(blogId);
        return "success";
    }

}
