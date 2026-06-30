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

public class User_toString_74585644417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2603;

    public User_toString_74585644417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2646 = new HashMap();
        Set<Object> term2681 =  ((Map) term2646).keySet();
        HashSet term2645 = new HashSet((Collection<? extends Object>) term2681);
        term2603 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2641 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2603, term2603.getClass(), "id", 2120084523938730454L);
        setField(term2603, term2603.getClass(), "email", "swZVeJAxjt");
        setField(term2603, term2603.getClass(), "login", "xOcJIiQQDu");
        setField(term2603, term2603.getClass(), "name", "GVizqqzXpy");
        setIntField(term2641, term2641.getClass(), "year", 2015);
        setShortField(term2641, term2641.getClass(), "month", (short) 7);
        setShortField(term2641, term2641.getClass(), "day", (short) 24);
        setField(term2603, term2603.getClass(), "birthday", term2641);
        setField(term2603, term2603.getClass(), "friends", term2645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2603, args);
    }

};


