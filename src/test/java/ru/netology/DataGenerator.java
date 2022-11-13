package ru.netology;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private static final Faker faker = new Faker(new Locale("ru"));

    public static String getCity() {
        return faker.address().city();
    }

    public static String getNewDate(int days) {
        String date = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String getIncorrectDate() {
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return today;
    }


    public static String getName() {
        return faker.name().fullName();
    }

    public static String getPhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public static String getIncorrectPhoneNumber() {
        return faker.phoneNumber().cellPhone();
    }


}
