package com.munchmate.app.entity;

import com.munchmate.app.dto.SourceDTO;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Nullable
    private String url;
    @Nullable
    private String book;
    @Nullable
    private Integer pageNumber;

    public Source(SourceDTO sourceDTO){
        this.name = sourceDTO.getName();
        this.url = sourceDTO.getUrl();
        this.book = sourceDTO.getBook();
        this.pageNumber = sourceDTO.getPageNumber();
    }
}
