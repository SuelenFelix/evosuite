package ru.yandex.practicum.filmorate.controllers;

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
import static ru.yandex.practicum.filmorate.controllers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FilmController_addLike_7984864611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term297;
     Object term299;

    public FilmController_addLike_7984864611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController"));
        setField(term296, term296.getClass(), "filmService", null);
        term297 = new Long(0L);
        term299 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term297;
        args[1] = term299;
        callMethod(klass, "addLike", argTypes, term296, args);
    }

};


