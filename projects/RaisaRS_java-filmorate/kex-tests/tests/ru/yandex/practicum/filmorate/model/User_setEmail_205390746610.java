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

public class User_setEmail_205390746610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1887;

    public User_setEmail_205390746610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1930 = new HashMap();
        Set<Object> term1982 =  ((Map) term1930).keySet();
        HashSet term1929 = new HashSet((Collection<? extends Object>) term1982);
        term1887 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1925 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1887, term1887.getClass(), "id", 8059786003080744426L);
        setField(term1887, term1887.getClass(), "email", "kBdSllIBVz");
        setField(term1887, term1887.getClass(), "login", "TJmVBGfTML");
        setField(term1887, term1887.getClass(), "name", "tPlsykYBqO");
        setIntField(term1925, term1925.getClass(), "year", 2017);
        setShortField(term1925, term1925.getClass(), "month", (short) 7);
        setShortField(term1925, term1925.getClass(), "day", (short) 22);
        setField(term1887, term1887.getClass(), "birthday", term1925);
        setField(term1887, term1887.getClass(), "friends", term1929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLPjGVBhlX";
        callMethod(klass, "setEmail", argTypes, term1887, args);
    }

};


