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

public class User_UserBuilder_birthday_1501601545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3150;
     Object term3192;

    public User_UserBuilder_birthday_1501601545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3150 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term3188 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3150, term3150.getClass(), "id", 6617340557564669657L);
        setField(term3150, term3150.getClass(), "email", "SJiQaLvSKv");
        setField(term3150, term3150.getClass(), "login", "OEXDRUKcFl");
        setField(term3150, term3150.getClass(), "name", "RYdKCNNMBR");
        setIntField(term3188, term3188.getClass(), "year", 2025);
        setShortField(term3188, term3188.getClass(), "month", (short) 4);
        setShortField(term3188, term3188.getClass(), "day", (short) 8);
        setField(term3150, term3150.getClass(), "birthday", term3188);
        term3192 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3192, term3192.getClass(), "year", 2012);
        setShortField(term3192, term3192.getClass(), "month", (short) 9);
        setShortField(term3192, term3192.getClass(), "day", (short) 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term3192;
        callMethod(klass, "birthday", argTypes, term3150, args);
    }

};


