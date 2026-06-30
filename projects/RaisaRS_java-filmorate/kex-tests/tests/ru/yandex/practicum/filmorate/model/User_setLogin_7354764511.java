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

public class User_setLogin_7354764511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1993;

    public User_setLogin_7354764511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2036 = new HashMap();
        Set<Object> term2104 =  ((Map) term2036).keySet();
        HashSet term2035 = new HashSet((Collection<? extends Object>) term2104);
        term1993 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2031 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1993, term1993.getClass(), "id", -4365849114644724155L);
        setField(term1993, term1993.getClass(), "email", "whBvTVIIlC");
        setField(term1993, term1993.getClass(), "login", "IgRJUzaCwW");
        setField(term1993, term1993.getClass(), "name", "JUmudUmaaV");
        setIntField(term2031, term2031.getClass(), "year", 2026);
        setShortField(term2031, term2031.getClass(), "month", (short) 12);
        setShortField(term2031, term2031.getClass(), "day", (short) 13);
        setField(term1993, term1993.getClass(), "birthday", term2031);
        setField(term1993, term1993.getClass(), "friends", term2035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setLogin", argTypes, term1993, args);
    }

};


