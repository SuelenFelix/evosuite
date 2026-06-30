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
import java.lang.Long;

public class User_init_40186190018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2682;
     Object term2720;

    public User_init_40186190018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2682 = new Long(6855071767938501807L);
        term2720 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2720, term2720.getClass(), "year", 2022);
        setShortField(term2720, term2720.getClass(), "month", (short) 11);
        setShortField(term2720, term2720.getClass(), "day", (short) 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[5];
        args[0] = term2682;
        args[1] = "JqXGgAhZPl";
        args[2] = "jiKYgYHqIS";
        args[3] = "DfISiziTgG";
        args[4] = term2720;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


