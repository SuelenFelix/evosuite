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

public class User_setBirthday_41248303611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1546;
     Object term1589;

    public User_setBirthday_41248303611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1547 = new Integer(2055867847);
        term1546 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1585 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1546, term1546.getClass(), "id", term1547);
        setField(term1546, term1546.getClass(), "email", "ytSBIKXogI");
        setField(term1546, term1546.getClass(), "login", "nHXjMycHlU");
        setField(term1546, term1546.getClass(), "name", "ieCtQFdkii");
        setIntField(term1585, term1585.getClass(), "year", 2026);
        setShortField(term1585, term1585.getClass(), "month", (short) 12);
        setShortField(term1585, term1585.getClass(), "day", (short) 13);
        setField(term1546, term1546.getClass(), "birthday", term1585);
        term1589 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1589, term1589.getClass(), "year", 2020);
        setShortField(term1589, term1589.getClass(), "month", (short) 5);
        setShortField(term1589, term1589.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1589;
        callMethod(klass, "setBirthday", argTypes, term1546, args);
    }

};


