package com.demo.truyenfull.filter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.truyenfull.filter.model.Category;
import com.demo.truyenfull.filter.model.Comic;

@Repository

public interface ComicRepository extends JpaRepository<Comic, Long> {
	Comic findByTitleLike(String title);

	List<Comic> findAllByCategories(Category category);

	Comic findByLink(String linkComic);

	@Query(value = "select * from comic c where c.author_code = ?1", nativeQuery = true)
	List<Comic> findByAuthorCode(String authorCode);

	@Query(value = "select * from comic c order by c.created_at desc limit 10", nativeQuery = true)
	List<Comic> findComicLastCreate();

	@Query(value = "select * from comic c order by c.updated_at desc limit 10", nativeQuery = true)
	List<Comic> findComicLastUpdate();

	@Query(value = "select * from comic c where c.status = ?1 ", nativeQuery = true)
	List<Comic> findComicIsFull(String status);

	@Query(value = "select * from comic c where c.status = ?1 ", nativeQuery = true)
	List<Comic> findComicIsRelease(String status);

	@Query(value = "select * from comic c order by c.rating desc limit 10 ", nativeQuery = true)
	List<Comic> findComicMostRate();

	@Query(value = "select * from comic c order by c.views desc limit 10", nativeQuery = true)
	List<Comic> findComicMostView();

//	@Modifying
//	@Transactional
//	@Query(value = "update commic c set c.number_of_chapter =?1 where c.title = ?2", nativeQuery = true)
//	public void updateNumberOfChapter(String numberOfChapter, String title);
}
