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
import java.lang.Object;

public class User_toString_74585644412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1531;

    public User_toString_74585644412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1531 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1568 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1531, term1531.getClass(), "login", "nHXjMycHlU");
        setField(term1531, term1531.getClass(), "name", "ieCtQFdkii");
        setField(term1531, term1531.getClass(), "email", "dEnhdmILtU");
        setIntField(term1568, term1568.getClass(), "year", 2025);
        setShortField(term1568, term1568.getClass(), "month", (short) 4);
        setShortField(term1568, term1568.getClass(), "day", (short) 23);
        setField(term1531, term1531.getClass(), "birthday", term1568);
        setLongField(term1531, term1531.getClass(), "id", -3838084482494604218L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1531, args);
    }

};


