package ru.yandex.practicum.filmorate.controller;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GenreController_findAllMpa_21061536920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;

    public GenreController_findAllMpa_21061536920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.GenreController"));
        Object term265 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.GenreService"));
        setField(term265, term265.getClass(), "genreStorage", null);
        setField(term264, term264.getClass(), "genreService", term265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.GenreController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findAllMpa", argTypes, term264, args);
    }

};


