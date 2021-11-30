package me.brunosantana.builder;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
public class Book {

    private String title;
    private String author;
    private String publishingCompany;

}
