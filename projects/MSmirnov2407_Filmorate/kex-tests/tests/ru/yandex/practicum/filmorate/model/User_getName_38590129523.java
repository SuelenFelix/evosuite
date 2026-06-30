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

public class User_getName_38590129523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1800;

    public User_getName_38590129523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1800 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        setField(term1800, term1800.getClass(), "login", null);
        setField(term1800, term1800.getClass(), "email", null);
        setField(term1800, term1800.getClass(), "name", null);
        setField(term1800, term1800.getClass(), "birthday", null);
        setField(term1800, term1800.getClass(), "friends", null);
        setField(term1800, term1800.getClass(), "likedFilms", null);
        setIntField(term1800, term1800.getClass(), "id", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1800, args);
    }

};


