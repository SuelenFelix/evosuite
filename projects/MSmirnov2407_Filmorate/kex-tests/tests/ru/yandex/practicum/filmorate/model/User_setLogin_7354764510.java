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

public class User_setLogin_7354764510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1058;

    public User_setLogin_7354764510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1100 = new HashMap();
        Set<Object> term1157 =  ((Map) term1100).keySet();
        HashSet term1099 = new HashSet((Collection<? extends Object>) term1157);
        HashMap term1106 = new HashMap();
        Set<Object> term1158 =  ((Map) term1106).keySet();
        HashSet term1105 = new HashSet((Collection<? extends Object>) term1158);
        term1058 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1095 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1058, term1058.getClass(), "login", "SJiQaLvSKv");
        setField(term1058, term1058.getClass(), "email", "OEXDRUKcFl");
        setField(term1058, term1058.getClass(), "name", "RYdKCNNMBR");
        setIntField(term1095, term1095.getClass(), "year", 2014);
        setShortField(term1095, term1095.getClass(), "month", (short) 5);
        setShortField(term1095, term1095.getClass(), "day", (short) 21);
        setField(term1058, term1058.getClass(), "birthday", term1095);
        setField(term1058, term1058.getClass(), "friends", term1099);
        setField(term1058, term1058.getClass(), "likedFilms", term1105);
        setIntField(term1058, term1058.getClass(), "id", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "setLogin", argTypes, term1058, args);
    }

};


