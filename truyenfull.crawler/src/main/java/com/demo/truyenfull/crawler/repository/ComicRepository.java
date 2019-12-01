package com.demo.truyenfull.crawler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.truyenfull.crawler.model.Comic;

@Repository

public interface ComicRepository extends JpaRepository<Comic, Long> {
	Comic findByTitle(String title);

//	@Modifying
//	@Transactional
//	@Query(value = "update commic c set c.number_of_chapter =?1 where c.title = ?2", nativeQuery = true)
//	public void updateNumberOfChapter(String numberOfChapter, String title);
}
