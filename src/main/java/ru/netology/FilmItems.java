package ru.netology;

public class FilmItems {
    private int id;
    private String name;

    public FilmItems(){

    }

    public FilmItems(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
