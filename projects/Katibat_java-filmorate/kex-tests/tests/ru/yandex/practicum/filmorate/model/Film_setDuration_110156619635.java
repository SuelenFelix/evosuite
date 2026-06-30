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

public class Film_setDuration_110156619635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5146;

    public Film_setDuration_110156619635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5146 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term5146, term5146.getClass(), "id", null);
        setField(term5146, term5146.getClass(), "name", null);
        setField(term5146, term5146.getClass(), "description", null);
        setField(term5146, term5146.getClass(), "releaseDate", null);
        setField(term5146, term5146.getClass(), "duration", null);
        setField(term5146, term5146.getClass(), "mpa", null);
        setField(term5146, term5146.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDuration", argTypes, term5146, args);
    }

};


