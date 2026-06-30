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

public class User_getId_9785821083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1221;

    public User_getId_9785821083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1264 = new HashMap();
        Set<Object> term1312 =  ((Map) term1264).keySet();
        HashSet term1263 = new HashSet((Collection<? extends Object>) term1312);
        term1221 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1259 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1221, term1221.getClass(), "id", -5476826692763582090L);
        setField(term1221, term1221.getClass(), "email", "GzFkzHGYFt");
        setField(term1221, term1221.getClass(), "login", "tShwQLRGNe");
        setField(term1221, term1221.getClass(), "name", "LvtrsXUliU");
        setIntField(term1259, term1259.getClass(), "year", 2021);
        setShortField(term1259, term1259.getClass(), "month", (short) 1);
        setShortField(term1259, term1259.getClass(), "day", (short) 18);
        setField(term1221, term1221.getClass(), "birthday", term1259);
        setField(term1221, term1221.getClass(), "friends", term1263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1221, args);
    }

};


