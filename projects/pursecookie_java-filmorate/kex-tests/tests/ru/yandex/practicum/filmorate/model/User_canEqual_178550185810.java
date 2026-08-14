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

public class User_canEqual_178550185810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1386;
     Object term1428;

    public User_canEqual_178550185810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1386 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1423 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1386, term1386.getClass(), "login", "JDswTTCZHV");
        setField(term1386, term1386.getClass(), "name", "onpbIeEKoi");
        setField(term1386, term1386.getClass(), "email", "YRHGsAkhxb");
        setIntField(term1423, term1423.getClass(), "year", 2026);
        setShortField(term1423, term1423.getClass(), "month", (short) 12);
        setShortField(term1423, term1423.getClass(), "day", (short) 13);
        setField(term1386, term1386.getClass(), "birthday", term1423);
        setLongField(term1386, term1386.getClass(), "id", -7738503207562305297L);
        term1428 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1428;
        callMethod(klass, "canEqual", argTypes, term1386, args);
    }

};


