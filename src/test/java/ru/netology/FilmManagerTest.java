package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private final FilmManager manager = new FilmManager(10);
    private final FilmItems service = new FilmItems();

    private final FilmItems film1 = new FilmItems(11, "film1", 2000);
    private final FilmItems film2 = new FilmItems(22, "film2", 2001);
    private final FilmItems film3 = new FilmItems(33, "film3", 2002);
    private final FilmItems film4 = new FilmItems(44, "film4", 2003);
    private final FilmItems film5 = new FilmItems(55, "film5", 2004);
    private final FilmItems film6 = new FilmItems(66, "film6", 2005);
    private final FilmItems film7 = new FilmItems(77, "film7", 2006);
    private final FilmItems film8 = new FilmItems(88, "film8", 2007);
    private final FilmItems film9 = new FilmItems(99, "film9", 2008);
    private final FilmItems film10 = new FilmItems(10, "film10", 2009);


    @Test
    public void add() {

        manager.add(film1);


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


    @Test
    void testGetAll() {
    }

    @Test
    void getAllFromEnd() {
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
}

