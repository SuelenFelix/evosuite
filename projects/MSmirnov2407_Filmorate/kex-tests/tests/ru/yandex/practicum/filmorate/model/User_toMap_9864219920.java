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

public class User_toMap_9864219920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;

    public User_toMap_9864219920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term248 = new HashMap();
        Set<Object> term301 =  ((Map) term248).keySet();
        HashSet term247 = new HashSet((Collection<? extends Object>) term301);
        HashMap term254 = new HashMap();
        Set<Object> term302 =  ((Map) term254).keySet();
        HashSet term253 = new HashSet((Collection<? extends Object>) term302);
        term206 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term243 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term206, term206.getClass(), "login", "hRNSzYYIrc");
        setField(term206, term206.getClass(), "email", "RMFIsYGgne");
        setField(term206, term206.getClass(), "name", "NRdvgJlhkX");
        setIntField(term243, term243.getClass(), "year", 2012);
        setShortField(term243, term243.getClass(), "month", (short) 8);
        setShortField(term243, term243.getClass(), "day", (short) 25);
        setField(term206, term206.getClass(), "birthday", term243);
        setField(term206, term206.getClass(), "friends", term247);
        setField(term206, term206.getClass(), "likedFilms", term253);
        setIntField(term206, term206.getClass(), "id", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMap", argTypes, term206, args);
    }

};


