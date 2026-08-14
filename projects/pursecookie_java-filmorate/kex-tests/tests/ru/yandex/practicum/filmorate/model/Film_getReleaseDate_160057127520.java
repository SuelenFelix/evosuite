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

public class Film_getReleaseDate_160057127520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;

    public Film_getReleaseDate_160057127520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3242 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term3242, term3242.getClass(), "name", null);
        setField(term3242, term3242.getClass(), "description", null);
        setField(term3242, term3242.getClass(), "releaseDate", null);
        setLongField(term3242, term3242.getClass(), "duration", 0L);
        setField(term3242, term3242.getClass(), "mpa", null);
        setField(term3242, term3242.getClass(), "genres", null);
        setLongField(term3242, term3242.getClass(), "id", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term3242, args);
    }

};


