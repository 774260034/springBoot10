package cn.controller;

import cn.domain.News;
import cn.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;
    @RequestMapping("/news/list")
    public List<News> getNewsAll(){
        return  newsService.getNewsAll();
    }
}
