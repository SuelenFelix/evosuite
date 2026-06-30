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

public class Film_getId_96443795535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8186;

    public Film_getId_96443795535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8186 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setLongField(term8186, term8186.getClass(), "id", 0L);
        setField(term8186, term8186.getClass(), "name", null);
        setField(term8186, term8186.getClass(), "description", null);
        setField(term8186, term8186.getClass(), "releaseDate", null);
        setIntField(term8186, term8186.getClass(), "duration", 0);
        setField(term8186, term8186.getClass(), "mpa", null);
        setField(term8186, term8186.getClass(), "genres", null);
        setField(term8186, term8186.getClass(), "likes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term8186, args);
    }

};


