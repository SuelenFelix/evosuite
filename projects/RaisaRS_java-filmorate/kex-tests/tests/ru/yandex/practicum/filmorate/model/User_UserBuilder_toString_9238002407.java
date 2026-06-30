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

public class User_UserBuilder_toString_9238002407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3298;

    public User_UserBuilder_toString_9238002407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3298 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term3336 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3298, term3298.getClass(), "id", -8708192233349544946L);
        setField(term3298, term3298.getClass(), "email", "XylxrMBraH");
        setField(term3298, term3298.getClass(), "login", "pORebkoRdD");
        setField(term3298, term3298.getClass(), "name", "mXGCWJDOqA");
        setIntField(term3336, term3336.getClass(), "year", 2021);
        setShortField(term3336, term3336.getClass(), "month", (short) 9);
        setShortField(term3336, term3336.getClass(), "day", (short) 6);
        setField(term3298, term3298.getClass(), "birthday", term3336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3298, args);
    }

};


