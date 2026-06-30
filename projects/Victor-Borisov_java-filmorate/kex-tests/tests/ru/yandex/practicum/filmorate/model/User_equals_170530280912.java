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

public class User_equals_170530280912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1623;
     Object term1666;

    public User_equals_170530280912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1624 = new Integer(-1048298087);
        term1623 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1662 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1623, term1623.getClass(), "id", term1624);
        setField(term1623, term1623.getClass(), "email", "dEnhdmILtU");
        setField(term1623, term1623.getClass(), "login", "hoicvmsovO");
        setField(term1623, term1623.getClass(), "name", "eqJfYWRaEL");
        setIntField(term1662, term1662.getClass(), "year", 2025);
        setShortField(term1662, term1662.getClass(), "month", (short) 4);
        setShortField(term1662, term1662.getClass(), "day", (short) 23);
        setField(term1623, term1623.getClass(), "birthday", term1662);
        term1666 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1666;
        callMethod(klass, "equals", argTypes, term1623, args);
    }

};


