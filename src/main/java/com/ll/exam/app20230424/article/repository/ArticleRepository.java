package com.ll.exam.app20230424.article.repository;

import com.ll.exam.app20230424.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
