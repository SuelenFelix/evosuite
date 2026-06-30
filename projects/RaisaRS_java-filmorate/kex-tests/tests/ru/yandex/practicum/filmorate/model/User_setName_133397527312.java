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

public class User_setName_133397527312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115;

    public User_setName_133397527312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2158 = new HashMap();
        Set<Object> term2222 =  ((Map) term2158).keySet();
        HashSet term2157 = new HashSet((Collection<? extends Object>) term2222);
        term2115 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2153 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2115, term2115.getClass(), "id", 2486810210675247493L);
        setField(term2115, term2115.getClass(), "email", "HqBOwkVqjD");
        setField(term2115, term2115.getClass(), "login", "MAcUBcBckh");
        setField(term2115, term2115.getClass(), "name", "oVgzLbrsFr");
        setIntField(term2153, term2153.getClass(), "year", 2020);
        setShortField(term2153, term2153.getClass(), "month", (short) 5);
        setShortField(term2153, term2153.getClass(), "day", (short) 14);
        setField(term2115, term2115.getClass(), "birthday", term2153);
        setField(term2115, term2115.getClass(), "friends", term2157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vQVyKLdtaz";
        callMethod(klass, "setName", argTypes, term2115, args);
    }

};


