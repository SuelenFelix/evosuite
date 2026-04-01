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

public class Film_setGenres_83201650838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6132;

    public Film_setGenres_83201650838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6132 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term6132, term6132.getClass(), "id", null);
        setField(term6132, term6132.getClass(), "name", null);
        setField(term6132, term6132.getClass(), "description", null);
        setField(term6132, term6132.getClass(), "releaseDate", null);
        setIntField(term6132, term6132.getClass(), "duration", 0);
        setField(term6132, term6132.getClass(), "mpa", null);
        setField(term6132, term6132.getClass(), "genres", null);
        setIntField(term6132, term6132.getClass(), "rate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenres", argTypes, term6132, args);
    }

};


