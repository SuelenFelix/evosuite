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

public class User_setBirthday_41248303632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2782;

    public User_setBirthday_41248303632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2782 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        setLongField(term2782, term2782.getClass(), "id", 0L);
        setField(term2782, term2782.getClass(), "email", null);
        setField(term2782, term2782.getClass(), "login", null);
        setField(term2782, term2782.getClass(), "name", null);
        setField(term2782, term2782.getClass(), "birthday", null);
        setField(term2782, term2782.getClass(), "friends", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBirthday", argTypes, term2782, args);
    }

};


