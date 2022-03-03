package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private FilmManager manager = new FilmManager(10);
    private FilmItems items = new FilmItems();

    FilmItems film1 = new FilmItems(11, "film1", 2000);
    FilmItems film2 = new FilmItems(22, "film2", 2001);
    FilmItems film3 = new FilmItems(33, "film3", 2002);
    FilmItems film4 = new FilmItems(44, "film4", 2003);
    FilmItems film5 = new FilmItems(55, "film5", 2004);
    FilmItems film6 = new FilmItems(66, "film6", 2005);
    FilmItems film7 = new FilmItems(77, "film7", 2006);
    FilmItems film8 = new FilmItems(88, "film8", 2007);
    FilmItems film9 = new FilmItems(99, "film9", 2008);
    FilmItems film10 = new FilmItems(10, "film10", 2009);


    @Test
    public void add() {

        manager.add(film1);
        manager.add(film3);


        FilmItems[] expected = {film1, film3};
        FilmItems[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void getAll() {
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);

        manager.getAll();

        FilmItems[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        FilmItems[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindAll() {
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);

        FilmItems[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        FilmItems[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);

        FilmItems[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        FilmItems[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastOtherLength() {
        FilmManager manager = new FilmManager(3);

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);

        FilmItems[] expected = {film4, film3, film2};
        FilmItems[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}

