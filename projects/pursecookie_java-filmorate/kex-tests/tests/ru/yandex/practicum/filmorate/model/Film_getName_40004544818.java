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

public class Film_getName_40004544818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3236;

    public Film_getName_40004544818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3236 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term3236, term3236.getClass(), "name", null);
        setField(term3236, term3236.getClass(), "description", null);
        setField(term3236, term3236.getClass(), "releaseDate", null);
        setLongField(term3236, term3236.getClass(), "duration", 0L);
        setField(term3236, term3236.getClass(), "mpa", null);
        setField(term3236, term3236.getClass(), "genres", null);
        setLongField(term3236, term3236.getClass(), "id", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3236, args);
    }

};


