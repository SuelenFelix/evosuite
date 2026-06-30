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

public class MpaController_findAllMpa_9225412250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;

    public MpaController_findAllMpa_9225412250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.MpaController"));
        Object term216 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term216, term216.getClass(), "filmStorage", null);
        setField(term216, term216.getClass(), "mpaStorage", null);
        setField(term216, term216.getClass(), "genreStorage", null);
        setField(term216, term216.getClass(), "likeStorage", null);
        setField(term216, term216.getClass(), "userStorage", null);
        setField(term215, term215.getClass(), "filmService", term216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.MpaController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findAllMpa", argTypes, term215, args);
    }

};


