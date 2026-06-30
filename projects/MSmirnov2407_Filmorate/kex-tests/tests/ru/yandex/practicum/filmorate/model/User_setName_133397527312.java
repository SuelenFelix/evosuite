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
     Object term1288;

    public User_setName_133397527312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1330 = new HashMap();
        Set<Object> term1395 =  ((Map) term1330).keySet();
        HashSet term1329 = new HashSet((Collection<? extends Object>) term1395);
        HashMap term1336 = new HashMap();
        Set<Object> term1396 =  ((Map) term1336).keySet();
        HashSet term1335 = new HashSet((Collection<? extends Object>) term1396);
        term1288 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1325 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1288, term1288.getClass(), "login", "EYtfuJaxiM");
        setField(term1288, term1288.getClass(), "email", "gCWtLVKVVe");
        setField(term1288, term1288.getClass(), "name", "fWKJoSoCwE");
        setIntField(term1325, term1325.getClass(), "year", 2021);
        setShortField(term1325, term1325.getClass(), "month", (short) 8);
        setShortField(term1325, term1325.getClass(), "day", (short) 11);
        setField(term1288, term1288.getClass(), "birthday", term1325);
        setField(term1288, term1288.getClass(), "friends", term1329);
        setField(term1288, term1288.getClass(), "likedFilms", term1335);
        setIntField(term1288, term1288.getClass(), "id", -112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UfQtPRyWRC";
        callMethod(klass, "setName", argTypes, term1288, args);
    }

};


