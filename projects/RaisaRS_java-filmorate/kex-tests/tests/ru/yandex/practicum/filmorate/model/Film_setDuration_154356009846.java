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
import java.lang.Integer;

public class Film_setDuration_154356009846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8221;
     Object term8224;

    public Film_setDuration_154356009846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8221 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setLongField(term8221, term8221.getClass(), "id", 0L);
        setField(term8221, term8221.getClass(), "name", null);
        setField(term8221, term8221.getClass(), "description", null);
        setField(term8221, term8221.getClass(), "releaseDate", null);
        setIntField(term8221, term8221.getClass(), "duration", 0);
        setField(term8221, term8221.getClass(), "mpa", null);
        setField(term8221, term8221.getClass(), "genres", null);
        setField(term8221, term8221.getClass(), "likes", null);
        term8224 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8224;
        callMethod(klass, "setDuration", argTypes, term8221, args);
    }

};


