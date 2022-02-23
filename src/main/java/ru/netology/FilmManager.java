package ru.netology;

public class FilmManager {
    private FilmItems[] items = new FilmItems[0];
    private int maxLength = 10;


    public FilmManager(FilmItems items) {

    }

    public FilmManager(FilmItems[] items, int maxLength) {
        this.items = items;
        this.maxLength = maxLength;
    }


    public void save(FilmItems item) {

        int length = items.length + 1;
        FilmItems[] tmp = new FilmItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public void add(FilmItems item) {
        FilmManager manager = new FilmManager(item);
        manager.save(item);
    }

    public FilmItems[] getAll() {

        FilmItems[] result;
        int resultLength;
        if (items.length > maxLength) {
            resultLength = maxLength;
            result = new FilmItems[resultLength];
            for (int i = 0; i < resultLength; i++) {
                int index = resultLength - i;
                result[i] = items[index];
            }
        } else {
            result = new FilmItems[items.length];
            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];

            }
        }
        return result;
    }

    public FilmItems[] getAllFromEnd() {
        findAll();
        FilmItems[] result;
        int resultLength;
        if (items.length > maxLength) {
            resultLength = maxLength;
            result = new FilmItems[resultLength];
            for (int i = maxLength; i > resultLength; i--) {
                int index = resultLength + i;
                result[i] = items[index];

            }
        } else {
            result = new FilmItems[items.length];
            for (int i = maxLength; i > items.length; i--) {
                int index = items.length - i + 1;
                result[i] = items[index];

            }
        }
        return result;
    }


    public FilmItems[] findAll() {
        return items;
    }
}
