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

public class FilmController_deleteLike_15656381975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;
     Object term500;
     Object term502;

    public FilmController_deleteLike_15656381975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term499 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService"));
        setField(term499, term499.getClass(), "filmStorage", null);
        setField(term499, term499.getClass(), "filmLikeStorage", null);
        setField(term499, term499.getClass(), "genreStorage", null);
        setField(term498, term498.getClass(), "filmService", term499);
        term500 = new Integer(-244121226);
        term502 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        Object[] args = new Object[2];
        args[0] = term500;
        args[1] = term502;
        callMethod(klass, "deleteLike", argTypes, term498, args);
    }

};


