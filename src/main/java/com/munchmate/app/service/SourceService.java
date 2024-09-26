package com.munchmate.app.service;

import com.munchmate.app.dto.SourceDTO;
import com.munchmate.app.entity.Source;
import com.munchmate.app.repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SourceService {
    @Autowired
    SourceRepository sourceRepository;

    public Optional<Source> findByBookAndPageNumber(String book, Integer pageNumber) {
        return sourceRepository.findByBookAndPageNumber(book, pageNumber);

    }

    public Optional<Source> findByUrl(String url) {
        return sourceRepository.findByUrl(url);
    }

    public Source createSource(SourceDTO sourceDTO){

        Optional<Source> existingSourceByBook = findByBookAndPageNumber(sourceDTO.getBook(), sourceDTO.getPageNumber());
        if (existingSourceByBook.isPresent()) {
            throw new IllegalArgumentException("Source already exists with book: " + sourceDTO.getBook() + " and page number: " + sourceDTO.getPageNumber());
        }

        Optional<Source> existingSourceByUrl = findByUrl(sourceDTO.getUrl());
        if (existingSourceByUrl.isPresent()) {
            throw new IllegalArgumentException("Source already exists with URL: " + sourceDTO.getUrl());
        }

        // Create the new source
        Source newSource = new Source(sourceDTO);

        return this.sourceRepository.save(newSource);
    }


}
