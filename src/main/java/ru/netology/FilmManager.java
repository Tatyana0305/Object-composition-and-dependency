package ru.netology;

public class FilmManager {
    private final int maxLength;
    private FilmItems[] items = new FilmItems[0];


    public FilmManager(int maxLength) {
        this.maxLength = maxLength;
    }

    public void add(FilmItems newItem) {
        FilmItems[] tmp = new FilmItems[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = newItem;
        this.items = tmp;
    }


    public void save(FilmItems item) {

        int length = items.length + 1;
        FilmItems[] tmp = new FilmItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public FilmItems[] getAll() {

        FilmItems[] result;

        result = new FilmItems[items.length];

        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];

        }
        return result;
    }

    public FilmItems[] findAll() {
        return items;
    }


    public FilmItems[] findLast() {

        int resultLength;

        if (items.length >= maxLength) {
            resultLength = maxLength;
            FilmItems[] tmp = new FilmItems[resultLength];
            for (int i = 0; i < maxLength; i++) {
                tmp[i] = items[items.length - 1 - i];
            }
            return tmp;
        } else {
            FilmItems[] tmp = new FilmItems[items.length];
            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[items.length - 1 - i];
            }
            return tmp;
        }
    }
}

