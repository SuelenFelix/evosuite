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

public class FilmService_addLike_7180981994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term475;
     Object term477;

    public FilmService_addLike_7180981994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term474, term474.getClass(), "filmStorage", null);
        setField(term474, term474.getClass(), "mpaStorage", null);
        setField(term474, term474.getClass(), "genreStorage", null);
        setField(term474, term474.getClass(), "likeStorage", null);
        setField(term474, term474.getClass(), "userStorage", null);
        term475 = new Integer(-655067527);
        term477 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term475;
        args[1] = term477;
        callMethod(klass, "addLike", argTypes, term474, args);
    }

};


