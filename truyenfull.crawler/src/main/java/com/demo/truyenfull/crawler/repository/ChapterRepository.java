package com.demo.truyenfull.crawler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.truyenfull.crawler.model.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
	Chapter findByTitleStartingWith(String numberOfchapter);

	Chapter findByTitle(String title);
}
