package ru.yandex.practicum.filmorate.storage;

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
import static ru.yandex.practicum.filmorate.storage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InMemoryFilmStorage_addLike_919566505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;

    public InMemoryFilmStorage_addLike_919566505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage"));
        setField(term349, term349.getClass(), "storagedData", null);
        setIntField(term349, term349.getClass(), "id", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addLike", argTypes, term349, args);
    }

};


