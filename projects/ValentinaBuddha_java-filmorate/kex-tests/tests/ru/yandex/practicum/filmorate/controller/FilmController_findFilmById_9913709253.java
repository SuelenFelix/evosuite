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

public class FilmController_findFilmById_9913709253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;
     Object term434;

    public FilmController_findFilmById_9913709253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term433 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term433, term433.getClass(), "filmStorage", null);
        setField(term433, term433.getClass(), "mpaStorage", null);
        setField(term433, term433.getClass(), "genreStorage", null);
        setField(term433, term433.getClass(), "likeStorage", null);
        setField(term433, term433.getClass(), "userStorage", null);
        setField(term432, term432.getClass(), "filmService", term433);
        term434 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term434;
        callMethod(klass, "findFilmById", argTypes, term432, args);
    }

};


