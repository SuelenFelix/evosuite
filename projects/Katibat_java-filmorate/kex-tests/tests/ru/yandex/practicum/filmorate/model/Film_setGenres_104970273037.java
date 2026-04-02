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

public class Film_setGenres_104970273037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5148;

    public Film_setGenres_104970273037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5148 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term5148, term5148.getClass(), "id", null);
        setField(term5148, term5148.getClass(), "name", null);
        setField(term5148, term5148.getClass(), "description", null);
        setField(term5148, term5148.getClass(), "releaseDate", null);
        setField(term5148, term5148.getClass(), "duration", null);
        setField(term5148, term5148.getClass(), "mpa", null);
        setField(term5148, term5148.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TreeSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenres", argTypes, term5148, args);
    }

};


