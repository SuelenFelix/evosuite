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

public class FilmController_addLike_798486463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term278;
     Object term280;

    public FilmController_addLike_798486463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController"));
        setField(term277, term277.getClass(), "filmService", null);
        term278 = new Long(-8257434502486459194L);
        term280 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term278;
        args[1] = term280;
        callMethod(klass, "addLike", argTypes, term277, args);
    }

};


