package com.munchmate.app.repository;

import com.munchmate.app.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SourceRepository extends JpaRepository<Source, Integer> {
    public Optional<Source> findByBookAndPageNumber(String book, Integer pageNumber);
    public Optional<Source> findByUrl(String url);
}
