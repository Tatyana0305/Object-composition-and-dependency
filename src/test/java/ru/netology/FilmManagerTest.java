package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    public void add() {
        FilmManager repo = new FilmManager();

        FilmManager[] item = new FilmManager[3];

        item[0] = new FilmManager("first", 100);
        item[1] = new FilmManager("first", 11);
        item[2] = new FilmManager("second", 22);


        repo.save(item[0]);
        repo.save(item[1]);
        repo.save(item[2]);

        repo.add(item[3]);

        FilmManager[] expected = {item[0], item[1], item[2], item[3]};
        FilmManager[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }


    @Test
    void getAll() {
        FilmManager repo = new FilmManager();

        FilmManager[] item = new FilmManager[3];

        item[0] = new FilmManager("first", 100);
        item[1] = new FilmManager("first", 11);
        item[2] = new FilmManager("second", 22);


        repo.save(item[0]);
        repo.save(item[1]);
        repo.save(item[2]);

        repo.getAll();

        FilmManager[] expected = {item[2], item[1], item[0]};
        FilmManager[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void getAllLast() {
        FilmManager repo = new FilmManager();

        FilmManager[] item = new FilmManager[3];

        item[0] = new FilmManager("first", 100);
        item[1] = new FilmManager("first", 11);
        item[2] = new FilmManager("second", 22);


        repo.save(item[0]);
        repo.save(item[1]);
        repo.save(item[2]);

        repo.getAll();

        FilmManager[] expected = {item[0], item[1], item[2]};
        FilmManager[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }



}


