package ru.praktikum.yandex;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name == null) {
            return false;
        }

        int length = name.length();
        if (length < 3 || length > 19) {
            return false;
        }

        int spaceIndex = name.indexOf(' ');
        int lastSpaceIndex = name.lastIndexOf(' ');

        // Проверка, что пробел только один и он не в начале/конце строки
        if (spaceIndex != lastSpaceIndex || spaceIndex == -1) {
            return false;
        }

        if (spaceIndex == 0 || spaceIndex == length - 1) {
            return false;
        }

        return true;
    }

}