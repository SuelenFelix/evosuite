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

public class User_setLogin_7354764527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1808;

    public User_setLogin_7354764527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1808 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        setField(term1808, term1808.getClass(), "login", null);
        setField(term1808, term1808.getClass(), "email", null);
        setField(term1808, term1808.getClass(), "name", null);
        setField(term1808, term1808.getClass(), "birthday", null);
        setField(term1808, term1808.getClass(), "friends", null);
        setField(term1808, term1808.getClass(), "likedFilms", null);
        setIntField(term1808, term1808.getClass(), "id", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLogin", argTypes, term1808, args);
    }

};


