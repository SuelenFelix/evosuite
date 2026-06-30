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

public class Film_toMap_9722778391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2074;

    public Film_toMap_9722778391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2107 = new HashMap();
        Set<Object> term2139 =  ((Map) term2107).keySet();
        HashSet term2106 = new HashSet((Collection<? extends Object>) term2139);
        HashMap term2113 = new HashMap();
        Set<Object> term2140 =  ((Map) term2113).keySet();
        HashSet term2112 = new HashSet((Collection<? extends Object>) term2140);
        term2074 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2104 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2074, term2074.getClass(), "name", "iljANwuEjk");
        setField(term2074, term2074.getClass(), "description", "kNqaJKIATy");
        setIntField(term2099, term2099.getClass(), "year", 2023);
        setShortField(term2099, term2099.getClass(), "month", (short) 7);
        setShortField(term2099, term2099.getClass(), "day", (short) 15);
        setField(term2074, term2074.getClass(), "releaseDate", term2099);
        setLongField(term2074, term2074.getClass(), "duration", 3892018155439224435L);
        setField(term2104, term2104.getClass(), "name", null);
        setIntField(term2104, term2104.getClass(), "id", 0);
        setField(term2074, term2074.getClass(), "mpa", term2104);
        setField(term2074, term2074.getClass(), "genres", term2106);
        setField(term2074, term2074.getClass(), "likedUsers", term2112);
        setIntField(term2074, term2074.getClass(), "id", -556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMap", argTypes, term2074, args);
    }

};


