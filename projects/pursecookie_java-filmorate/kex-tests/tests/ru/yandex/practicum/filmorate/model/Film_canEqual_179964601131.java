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

public class Film_canEqual_179964601131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3277;

    public Film_canEqual_179964601131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3277 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term3277, term3277.getClass(), "name", null);
        setField(term3277, term3277.getClass(), "description", null);
        setField(term3277, term3277.getClass(), "releaseDate", null);
        setLongField(term3277, term3277.getClass(), "duration", 0L);
        setField(term3277, term3277.getClass(), "mpa", null);
        setField(term3277, term3277.getClass(), "genres", null);
        setLongField(term3277, term3277.getClass(), "id", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term3277, args);
    }

};


