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
import java.lang.Integer;
import java.lang.Object;

public class User_equals_170530280913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1894;
     Object term1937;

    public User_equals_170530280913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1895 = new Integer(-1456670397);
        term1894 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1933 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1894, term1894.getClass(), "id", term1895);
        setField(term1894, term1894.getClass(), "email", "JUmudUmaaV");
        setField(term1894, term1894.getClass(), "login", "KoyGrUJeJW");
        setField(term1894, term1894.getClass(), "name", "HqBOwkVqjD");
        setIntField(term1933, term1933.getClass(), "year", 2015);
        setShortField(term1933, term1933.getClass(), "month", (short) 7);
        setShortField(term1933, term1933.getClass(), "day", (short) 24);
        setField(term1894, term1894.getClass(), "birthday", term1933);
        term1937 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1937;
        callMethod(klass, "equals", argTypes, term1894, args);
    }

};


