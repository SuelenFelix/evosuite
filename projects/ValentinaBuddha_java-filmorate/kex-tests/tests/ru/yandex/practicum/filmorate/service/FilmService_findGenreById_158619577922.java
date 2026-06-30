package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FilmService_findGenreById_158619577922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519;
     Object term520;

    public FilmService_findGenreById_158619577922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term519, term519.getClass(), "filmStorage", null);
        setField(term519, term519.getClass(), "mpaStorage", null);
        setField(term519, term519.getClass(), "genreStorage", null);
        setField(term519, term519.getClass(), "likeStorage", null);
        setField(term519, term519.getClass(), "userStorage", null);
        term520 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term520;
        callMethod(klass, "findGenreById", argTypes, term519, args);
    }

};


