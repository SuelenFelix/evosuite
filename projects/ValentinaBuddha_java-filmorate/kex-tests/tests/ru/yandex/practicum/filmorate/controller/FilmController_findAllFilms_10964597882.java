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

public class FilmController_findAllFilms_10964597882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430;

    public FilmController_findAllFilms_10964597882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term431 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term431, term431.getClass(), "filmStorage", null);
        setField(term431, term431.getClass(), "mpaStorage", null);
        setField(term431, term431.getClass(), "genreStorage", null);
        setField(term431, term431.getClass(), "likeStorage", null);
        setField(term431, term431.getClass(), "userStorage", null);
        setField(term430, term430.getClass(), "filmService", term431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findAllFilms", argTypes, term430, args);
    }

};


