package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    FilmItems items = new FilmItems();
    FilmManager manager = new FilmManager(items);


    FilmItems film1 = new FilmItems(11, "film1");
    FilmItems film2 = new FilmItems(22, "film2");
    FilmItems film3 = new FilmItems(33, "film3");
    FilmItems film4 = new FilmItems(44, "film4");
    FilmItems film5 = new FilmItems(55, "film5");
    FilmItems film6 = new FilmItems(66, "film6");
    FilmItems film7 = new FilmItems(77, "film7");
    FilmItems film8 = new FilmItems(88, "film8");
    FilmItems film9 = new FilmItems(99, "film9");
    FilmItems film10 = new FilmItems(10, "film10");


    @Test
    public void add() {

        manager.save(film1);


        FilmItems[] expected = {film1};
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



}

