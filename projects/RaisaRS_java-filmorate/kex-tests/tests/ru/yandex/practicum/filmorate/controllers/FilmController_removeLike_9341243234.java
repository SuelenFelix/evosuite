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

public class FilmController_removeLike_9341243234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;
     Object term283;
     Object term285;

    public FilmController_removeLike_9341243234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController"));
        setField(term282, term282.getClass(), "filmService", null);
        term283 = new Long(5270370404989704783L);
        term285 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term283;
        args[1] = term285;
        callMethod(klass, "removeLike", argTypes, term282, args);
    }

};


