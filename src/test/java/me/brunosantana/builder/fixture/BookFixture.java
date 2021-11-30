package me.brunosantana.builder.fixture;

import me.brunosantana.builder.Book;

public class BookFixture {

    public static Book create(){
        return Book.builder()
                .title("Fome por Deus")
                .author("John Piper")
                .publishingCompany("Cultura Crista")
                .build();
    }

    public static Book createAnotherBook(){
        return BookFixture.create()
                .setTitle("Hebreus - Serie Interpretando o Novo Testamento")
                .setAuthor("Augustus Nicodemus Lopes");
    }

}
