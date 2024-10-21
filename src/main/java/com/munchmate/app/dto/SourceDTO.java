package com.munchmate.app.dto;

import com.munchmate.app.entity.Source;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SourceDTO {
    private String name;
    private String url;
    private String book;
    private Integer pageNumber;

    public SourceDTO(Source source){
        this.name = source.getName();
        this.url = source.getUrl();
        this.book = source.getBook();
        this.pageNumber = source.getPageNumber();
    }

    @Override
    public String toString() {
        return "SourceDTO{" +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", book='" + book + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
