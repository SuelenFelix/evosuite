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

public class FilmService_removeLike_13617747817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;
     Object term507;
     Object term509;

    public FilmService_removeLike_13617747817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term506, term506.getClass(), "filmStorage", null);
        setField(term506, term506.getClass(), "mpaStorage", null);
        setField(term506, term506.getClass(), "genreStorage", null);
        setField(term506, term506.getClass(), "likeStorage", null);
        setField(term506, term506.getClass(), "userStorage", null);
        term507 = new Integer(0);
        term509 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term507;
        args[1] = term509;
        callMethod(klass, "removeLike", argTypes, term506, args);
    }

};


