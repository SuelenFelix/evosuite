package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Film_setId_137833375528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4811;

    public Film_setId_137833375528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4811 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term4811, term4811.getClass(), "id", null);
        setField(term4811, term4811.getClass(), "name", null);
        setField(term4811, term4811.getClass(), "description", null);
        setField(term4811, term4811.getClass(), "releaseDate", null);
        setField(term4811, term4811.getClass(), "duration", null);
        setField(term4811, term4811.getClass(), "mpa", null);
        setField(term4811, term4811.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term4811, args);
    }

};


