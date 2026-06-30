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

public class User_getName_3859012956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674;

    public User_getName_3859012956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term716 = new HashMap();
        Set<Object> term771 =  ((Map) term716).keySet();
        HashSet term715 = new HashSet((Collection<? extends Object>) term771);
        HashMap term722 = new HashMap();
        Set<Object> term772 =  ((Map) term722).keySet();
        HashSet term721 = new HashSet((Collection<? extends Object>) term772);
        term674 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term711 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term674, term674.getClass(), "login", "MLqYREekMl");
        setField(term674, term674.getClass(), "email", "ytSBIKXogI");
        setField(term674, term674.getClass(), "name", "nHXjMycHlU");
        setIntField(term711, term711.getClass(), "year", 2018);
        setShortField(term711, term711.getClass(), "month", (short) 9);
        setShortField(term711, term711.getClass(), "day", (short) 27);
        setField(term674, term674.getClass(), "birthday", term711);
        setField(term674, term674.getClass(), "friends", term715);
        setField(term674, term674.getClass(), "likedFilms", term721);
        setIntField(term674, term674.getClass(), "id", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term674, args);
    }

};


