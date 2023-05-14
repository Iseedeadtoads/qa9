package ru.netology.javaqa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Сергей";
        post.passport = "9999 № 99999999";
        post.patronymic = "Джекичанович";
        post.phone = "8(123)45678910";
        post.surname = "Ли";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1915;

    }
}