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

public class FilmController_findPopular_9457513136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term450;

    public FilmController_findPopular_9457513136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term449 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term449, term449.getClass(), "filmStorage", null);
        setField(term449, term449.getClass(), "mpaStorage", null);
        setField(term449, term449.getClass(), "genreStorage", null);
        setField(term449, term449.getClass(), "likeStorage", null);
        setField(term449, term449.getClass(), "userStorage", null);
        setField(term448, term448.getClass(), "filmService", term449);
        term450 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term450;
        callMethod(klass, "findPopular", argTypes, term448, args);
    }

};


