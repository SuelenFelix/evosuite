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

public class FilmController_addFilmLike_3145903694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;
     Object term438;
     Object term440;

    public FilmController_addFilmLike_3145903694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term437 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term437, term437.getClass(), "filmStorage", null);
        setField(term437, term437.getClass(), "mpaStorage", null);
        setField(term437, term437.getClass(), "genreStorage", null);
        setField(term437, term437.getClass(), "likeStorage", null);
        setField(term437, term437.getClass(), "userStorage", null);
        setField(term436, term436.getClass(), "filmService", term437);
        term438 = new Integer(-2068769794);
        term440 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term438;
        args[1] = term440;
        callMethod(klass, "addFilmLike", argTypes, term436, args);
    }

};


