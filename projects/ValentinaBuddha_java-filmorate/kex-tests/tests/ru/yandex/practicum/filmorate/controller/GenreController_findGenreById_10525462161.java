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
import java.lang.Integer;

public class GenreController_findGenreById_10525462161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term208;

    public GenreController_findGenreById_10525462161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.GenreController"));
        Object term207 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term207, term207.getClass(), "filmStorage", null);
        setField(term207, term207.getClass(), "mpaStorage", null);
        setField(term207, term207.getClass(), "genreStorage", null);
        setField(term207, term207.getClass(), "likeStorage", null);
        setField(term207, term207.getClass(), "userStorage", null);
        setField(term206, term206.getClass(), "filmService", term207);
        term208 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.GenreController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term208;
        callMethod(klass, "findGenreById", argTypes, term206, args);
    }

};


