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

public class FilmService_findPopular_41787924318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;
     Object term512;

    public FilmService_findPopular_41787924318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term511, term511.getClass(), "filmStorage", null);
        setField(term511, term511.getClass(), "mpaStorage", null);
        setField(term511, term511.getClass(), "genreStorage", null);
        setField(term511, term511.getClass(), "likeStorage", null);
        setField(term511, term511.getClass(), "userStorage", null);
        term512 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term512;
        callMethod(klass, "findPopular", argTypes, term511, args);
    }

};


