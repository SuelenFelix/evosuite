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

public class FilmController_removeFilmLike_5547913585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;
     Object term444;
     Object term446;

    public FilmController_removeFilmLike_5547913585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term443 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term443, term443.getClass(), "filmStorage", null);
        setField(term443, term443.getClass(), "mpaStorage", null);
        setField(term443, term443.getClass(), "genreStorage", null);
        setField(term443, term443.getClass(), "likeStorage", null);
        setField(term443, term443.getClass(), "userStorage", null);
        setField(term442, term442.getClass(), "filmService", term443);
        term444 = new Integer(-1955890973);
        term446 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        Object[] args = new Object[2];
        args[0] = term444;
        args[1] = term446;
        callMethod(klass, "removeFilmLike", argTypes, term442, args);
    }

};


