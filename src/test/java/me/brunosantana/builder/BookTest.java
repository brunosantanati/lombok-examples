package me.brunosantana.builder;

import me.brunosantana.builder.fixture.BookFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void should_CreateABookSuccessfully(){
        var book = BookFixture.create();

        assertEquals("Fome por Deus", book.getTitle());
        assertEquals("John Piper", book.getAuthor());
        assertEquals("Cultura Crista", book.getPublishingCompany());
    }

    @Test
    public void should_CreateAnotherBookSuccessfully(){
        var book = BookFixture.createAnotherBook();

        assertEquals("Hebreus - Serie Interpretando o Novo Testamento", book.getTitle());
        assertEquals("Augustus Nicodemus Lopes", book.getAuthor());
        assertEquals("Cultura Crista", book.getPublishingCompany());
    }

}
