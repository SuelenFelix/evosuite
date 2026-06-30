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

public class User_getFriends_9836152128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;

    public User_getFriends_9836152128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term904 = new HashMap();
        Set<Object> term957 =  ((Map) term904).keySet();
        HashSet term903 = new HashSet((Collection<? extends Object>) term957);
        HashMap term910 = new HashMap();
        Set<Object> term958 =  ((Map) term910).keySet();
        HashSet term909 = new HashSet((Collection<? extends Object>) term958);
        term862 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term899 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term862, term862.getClass(), "login", "wGmYcqUkgE");
        setField(term862, term862.getClass(), "email", "idgaQsnJpQ");
        setField(term862, term862.getClass(), "name", "VgZnGoIFwQ");
        setIntField(term899, term899.getClass(), "year", 2015);
        setShortField(term899, term899.getClass(), "month", (short) 9);
        setShortField(term899, term899.getClass(), "day", (short) 15);
        setField(term862, term862.getClass(), "birthday", term899);
        setField(term862, term862.getClass(), "friends", term903);
        setField(term862, term862.getClass(), "likedFilms", term909);
        setIntField(term862, term862.getClass(), "id", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriends", argTypes, term862, args);
    }

};


