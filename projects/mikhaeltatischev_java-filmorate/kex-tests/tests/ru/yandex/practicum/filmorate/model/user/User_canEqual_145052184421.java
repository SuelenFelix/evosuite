package ru.yandex.practicum.filmorate.model.user;

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
import static ru.yandex.practicum.filmorate.model.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_canEqual_145052184421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2169;
     Object term2247;

    public User_canEqual_145052184421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2170 = new Long(1667122142089513324L);
        HashMap term2213 = new HashMap();
        Set<Object> term2278 =  ((Map) term2213).keySet();
        HashSet term2212 = new HashSet((Collection<? extends Object>) term2278);
        term2169 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term2208 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2169, term2169.getClass(), "id", term2170);
        setField(term2169, term2169.getClass(), "email", "bLPjGVBhlX");
        setField(term2169, term2169.getClass(), "login", "whBvTVIIlC");
        setField(term2169, term2169.getClass(), "name", "IgRJUzaCwW");
        setIntField(term2208, term2208.getClass(), "year", 2025);
        setShortField(term2208, term2208.getClass(), "month", (short) 4);
        setShortField(term2208, term2208.getClass(), "day", (short) 8);
        setField(term2169, term2169.getClass(), "birthday", term2208);
        setField(term2169, term2169.getClass(), "friendsId", term2212);
        term2247 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2247;
        callMethod(klass, "canEqual", argTypes, term2169, args);
    }

};


