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

public class User_canEqual_178550185815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2426;
     Object term2487;

    public User_canEqual_178550185815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2469 = new HashMap();
        Set<Object> term2518 =  ((Map) term2469).keySet();
        HashSet term2468 = new HashSet((Collection<? extends Object>) term2518);
        term2426 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2464 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2426, term2426.getClass(), "id", -4502405999831680926L);
        setField(term2426, term2426.getClass(), "email", "cAPeiZHKGJ");
        setField(term2426, term2426.getClass(), "login", "LvJFtLBaxj");
        setField(term2426, term2426.getClass(), "name", "PHvxnGHptP");
        setIntField(term2464, term2464.getClass(), "year", 2029);
        setShortField(term2464, term2464.getClass(), "month", (short) 1);
        setShortField(term2464, term2464.getClass(), "day", (short) 20);
        setField(term2426, term2426.getClass(), "birthday", term2464);
        setField(term2426, term2426.getClass(), "friends", term2468);
        term2487 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2487;
        callMethod(klass, "canEqual", argTypes, term2426, args);
    }

};


