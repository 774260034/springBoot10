package cn.service;

import cn.domain.News;

import java.util.List;

public interface NewsService {

    List<News> getNewsAll();
    News getNewsById(int id);
    boolean addNews(News news);
    boolean updateNews(News news);
    boolean delNews(int id);
}
