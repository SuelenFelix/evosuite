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

public class FilmController_setLike_569742766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486;
     Object term488;
     Object term490;

    public FilmController_setLike_569742766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term487 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term487, term487.getClass(), "userStorage", null);
        setField(term487, term487.getClass(), "storage", null);
        setField(term486, term486.getClass(), "filmService", term487);
        term488 = new Integer(-203030934);
        term490 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term488;
        args[1] = term490;
        callMethod(klass, "setLike", argTypes, term486, args);
    }

};


