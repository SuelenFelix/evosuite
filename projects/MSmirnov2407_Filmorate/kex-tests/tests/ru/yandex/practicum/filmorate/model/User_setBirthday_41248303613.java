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
     Object term1407;
     Object term1472;

    public User_setBirthday_41248303613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1449 = new HashMap();
        Set<Object> term1506 =  ((Map) term1449).keySet();
        HashSet term1448 = new HashSet((Collection<? extends Object>) term1506);
        HashMap term1455 = new HashMap();
        Set<Object> term1507 =  ((Map) term1455).keySet();
        HashSet term1454 = new HashSet((Collection<? extends Object>) term1507);
        term1407 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1444 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1407, term1407.getClass(), "login", "FPvxVzzSvD");
        setField(term1407, term1407.getClass(), "email", "WHcwFgsGFC");
        setField(term1407, term1407.getClass(), "name", "HzqpegHiRq");
        setIntField(term1444, term1444.getClass(), "year", 2012);
        setShortField(term1444, term1444.getClass(), "month", (short) 8);
        setShortField(term1444, term1444.getClass(), "day", (short) 25);
        setField(term1407, term1407.getClass(), "birthday", term1444);
        setField(term1407, term1407.getClass(), "friends", term1448);
        setField(term1407, term1407.getClass(), "likedFilms", term1454);
        setIntField(term1407, term1407.getClass(), "id", 335112684);
        term1472 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1472, term1472.getClass(), "year", 2010);
        setShortField(term1472, term1472.getClass(), "month", (short) 5);
        setShortField(term1472, term1472.getClass(), "day", (short) 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1472;
        callMethod(klass, "setBirthday", argTypes, term1407, args);
    }

};


