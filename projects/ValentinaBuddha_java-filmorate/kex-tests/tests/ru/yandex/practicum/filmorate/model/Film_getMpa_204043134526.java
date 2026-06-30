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

public class Film_getMpa_204043134526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4809;

    public Film_getMpa_204043134526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4809 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term4809, term4809.getClass(), "id", null);
        setField(term4809, term4809.getClass(), "name", null);
        setField(term4809, term4809.getClass(), "description", null);
        setField(term4809, term4809.getClass(), "releaseDate", null);
        setField(term4809, term4809.getClass(), "duration", null);
        setField(term4809, term4809.getClass(), "mpa", null);
        setField(term4809, term4809.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term4809, args);
    }

};


