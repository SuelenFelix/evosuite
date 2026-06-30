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

public class User_equals_170530280914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2337;
     Object term2394;

    public User_equals_170530280914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2380 = new HashMap();
        Set<Object> term2425 =  ((Map) term2380).keySet();
        HashSet term2379 = new HashSet((Collection<? extends Object>) term2425);
        term2337 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2375 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2337, term2337.getClass(), "id", -7672528020740371001L);
        setField(term2337, term2337.getClass(), "email", "VgZnGoIFwQ");
        setField(term2337, term2337.getClass(), "login", "jUbSRrkrYZ");
        setField(term2337, term2337.getClass(), "name", "bWWfajKbEX");
        setIntField(term2375, term2375.getClass(), "year", 2024);
        setShortField(term2375, term2375.getClass(), "month", (short) 1);
        setShortField(term2375, term2375.getClass(), "day", (short) 24);
        setField(term2337, term2337.getClass(), "birthday", term2375);
        setField(term2337, term2337.getClass(), "friends", term2379);
        term2394 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2394;
        callMethod(klass, "equals", argTypes, term2337, args);
    }

};


