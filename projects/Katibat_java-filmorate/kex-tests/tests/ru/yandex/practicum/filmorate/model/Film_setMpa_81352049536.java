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

public class Film_setMpa_81352049536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5147;

    public Film_setMpa_81352049536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5147 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term5147, term5147.getClass(), "id", null);
        setField(term5147, term5147.getClass(), "name", null);
        setField(term5147, term5147.getClass(), "description", null);
        setField(term5147, term5147.getClass(), "releaseDate", null);
        setField(term5147, term5147.getClass(), "duration", null);
        setField(term5147, term5147.getClass(), "mpa", null);
        setField(term5147, term5147.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMpa", argTypes, term5147, args);
    }

};


