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
import java.lang.Long;

public class FilmDbService_addLike_2170448114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;
     Object term451;
     Object term453;

    public FilmDbService_addLike_2170448114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService"));
        setField(term450, term450.getClass(), "filmStorage", null);
        setField(term450, term450.getClass(), "userService", null);
        setField(term450, term450.getClass(), "genreStorage", null);
        term451 = new Long(0L);
        term453 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term451;
        args[1] = term453;
        callMethod(klass, "addLike", argTypes, term450, args);
    }

};


