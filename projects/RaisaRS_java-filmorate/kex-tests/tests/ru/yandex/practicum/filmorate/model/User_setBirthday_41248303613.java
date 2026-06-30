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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_setBirthday_41248303613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233;
     Object term2302;

    public User_setBirthday_41248303613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2276 = new HashMap();
        Set<Object> term2336 =  ((Map) term2276).keySet();
        HashSet term2275 = new HashSet((Collection<? extends Object>) term2336);
        term2233 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2271 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2233, term2233.getClass(), "id", 7009926388951271268L);
        setField(term2233, term2233.getClass(), "email", "OWKQODBLzb");
        setField(term2233, term2233.getClass(), "login", "wGmYcqUkgE");
        setField(term2233, term2233.getClass(), "name", "idgaQsnJpQ");
        setIntField(term2271, term2271.getClass(), "year", 2025);
        setShortField(term2271, term2271.getClass(), "month", (short) 4);
        setShortField(term2271, term2271.getClass(), "day", (short) 23);
        setField(term2233, term2233.getClass(), "birthday", term2271);
        setField(term2233, term2233.getClass(), "friends", term2275);
        term2302 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2302, term2302.getClass(), "year", 2012);
        setShortField(term2302, term2302.getClass(), "month", (short) 10);
        setShortField(term2302, term2302.getClass(), "day", (short) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2302;
        callMethod(klass, "setBirthday", argTypes, term2233, args);
    }

};


