package com.demo.truyenfull.filter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.truyenfull.filter.model.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
	Chapter findByTitleStartingWith(String numberOfchapter);

	Chapter findByTitle(String title);

	@Query(value = "select * from chapter ch where ch.comic_id = ?1 ", nativeQuery = true)
	List<Chapter> getComicChapters(Long comicId);
}
