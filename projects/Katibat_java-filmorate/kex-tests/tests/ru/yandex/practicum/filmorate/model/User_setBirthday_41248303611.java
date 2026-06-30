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

public class User_setBirthday_41248303611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1404;
     Object term1447;

    public User_setBirthday_41248303611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1405 = new Long(-5892135042702373494L);
        term1404 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1443 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1404, term1404.getClass(), "id", term1405);
        setField(term1404, term1404.getClass(), "email", "onpbIeEKoi");
        setField(term1404, term1404.getClass(), "login", "YRHGsAkhxb");
        setField(term1404, term1404.getClass(), "name", "ffYhPOzlUs");
        setIntField(term1443, term1443.getClass(), "year", 2026);
        setShortField(term1443, term1443.getClass(), "month", (short) 12);
        setShortField(term1443, term1443.getClass(), "day", (short) 13);
        setField(term1404, term1404.getClass(), "birthday", term1443);
        term1447 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1447, term1447.getClass(), "year", 2020);
        setShortField(term1447, term1447.getClass(), "month", (short) 5);
        setShortField(term1447, term1447.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1447;
        callMethod(klass, "setBirthday", argTypes, term1404, args);
    }

};


