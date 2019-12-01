package com.demo.truyenfull.crawler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.truyenfull.crawler.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
