package ru.netology;

public class FilmManager {
    private String name;
    private int id;
    public int count;

    public FilmManager() {
    }

    public FilmManager(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public FilmManager[] items = new FilmManager[count];


    public static void main(FilmManager[] items) {

    }

    public void add(FilmManager item) {
        int length = items.length + 1;
        FilmManager[] tmp = new FilmManager[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public void save(FilmManager item) {

        int length = items.length + 1;
        FilmManager[] tmp = new FilmManager[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        items = tmp;
    }


    public FilmManager[] getAll() {

        FilmManager[] result = new FilmManager[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public FilmManager[] getAllLast() {

        FilmManager[] result = new FilmManager[items.length];
        for (int i = count; i > result.length; i--) {
            int index = items.length - i + 1;
            result[i] = items[index];
        }
        return result;
    }



    public FilmManager[] findAll() {
        return items;
    }


}
