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

public class Film_setDescription_148935392344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8215;

    public Film_setDescription_148935392344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8215 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setLongField(term8215, term8215.getClass(), "id", 0L);
        setField(term8215, term8215.getClass(), "name", null);
        setField(term8215, term8215.getClass(), "description", null);
        setField(term8215, term8215.getClass(), "releaseDate", null);
        setIntField(term8215, term8215.getClass(), "duration", 0);
        setField(term8215, term8215.getClass(), "mpa", null);
        setField(term8215, term8215.getClass(), "genres", null);
        setField(term8215, term8215.getClass(), "likes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescription", argTypes, term8215, args);
    }

};


