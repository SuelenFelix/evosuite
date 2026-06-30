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

public class Film_setDescription_148935392334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6118;

    public Film_setDescription_148935392334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6118 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term6118, term6118.getClass(), "id", null);
        setField(term6118, term6118.getClass(), "name", null);
        setField(term6118, term6118.getClass(), "description", null);
        setField(term6118, term6118.getClass(), "releaseDate", null);
        setIntField(term6118, term6118.getClass(), "duration", 0);
        setField(term6118, term6118.getClass(), "mpa", null);
        setField(term6118, term6118.getClass(), "genres", null);
        setIntField(term6118, term6118.getClass(), "rate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescription", argTypes, term6118, args);
    }

};


