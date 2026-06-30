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

public class MpaController_init_8048883752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;

    public MpaController_init_8048883752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term221, term221.getClass(), "filmStorage", null);
        setField(term221, term221.getClass(), "mpaStorage", null);
        setField(term221, term221.getClass(), "genreStorage", null);
        setField(term221, term221.getClass(), "likeStorage", null);
        setField(term221, term221.getClass(), "userStorage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.MpaController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Object[] args = new Object[1];
        args[0] = term221;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


