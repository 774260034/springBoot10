package cn.service.impl;

import cn.dao.NewsDao;
import cn.domain.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NewsService implements cn.service.NewsService {
    @Resource
    private NewsDao newsDao;
    @Override
    public List<News> getNewsAll() {
        return newsDao.findAll();
    }

    @Override
    public News getNewsById(int id) {
        return newsDao.findById(id);
    }

    @Override
    public boolean addNews(News news) {
        return newsDao.add(news)>0;
    }

    @Override
    public boolean updateNews(News news) {
        return newsDao.update(news)>0;
    }

    @Override
    public boolean delNews(int id) {
        return newsDao.delById(id)>0;
    }
}
