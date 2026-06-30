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
import java.lang.Long;
import java.lang.Object;

public class User_equals_170530280912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1481;
     Object term1524;

    public User_equals_170530280912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1482 = new Long(5262507301787091109L);
        term1481 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1520 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1481, term1481.getClass(), "id", term1482);
        setField(term1481, term1481.getClass(), "email", "MLqYREekMl");
        setField(term1481, term1481.getClass(), "login", "ytSBIKXogI");
        setField(term1481, term1481.getClass(), "name", "nHXjMycHlU");
        setIntField(term1520, term1520.getClass(), "year", 2025);
        setShortField(term1520, term1520.getClass(), "month", (short) 4);
        setShortField(term1520, term1520.getClass(), "day", (short) 23);
        setField(term1481, term1481.getClass(), "birthday", term1520);
        term1524 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1524;
        callMethod(klass, "equals", argTypes, term1481, args);
    }

};


