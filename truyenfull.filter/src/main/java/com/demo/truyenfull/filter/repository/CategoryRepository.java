package com.demo.truyenfull.filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.truyenfull.filter.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByLink(String link);
}
