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

public class FilmService_addLike_71809819916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;
     Object term502;
     Object term504;

    public FilmService_addLike_71809819916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term501, term501.getClass(), "filmStorage", null);
        setField(term501, term501.getClass(), "mpaStorage", null);
        setField(term501, term501.getClass(), "genreStorage", null);
        setField(term501, term501.getClass(), "likeStorage", null);
        setField(term501, term501.getClass(), "userStorage", null);
        term502 = new Integer(0);
        term504 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term502;
        args[1] = term504;
        callMethod(klass, "addLike", argTypes, term501, args);
    }

};


