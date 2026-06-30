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

public class GenreController_findAllGenres_6541398020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;

    public GenreController_findAllGenres_6541398020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.GenreController"));
        Object term205 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term205, term205.getClass(), "filmStorage", null);
        setField(term205, term205.getClass(), "mpaStorage", null);
        setField(term205, term205.getClass(), "genreStorage", null);
        setField(term205, term205.getClass(), "likeStorage", null);
        setField(term205, term205.getClass(), "userStorage", null);
        setField(term204, term204.getClass(), "filmService", term205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.GenreController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findAllGenres", argTypes, term204, args);
    }

};


