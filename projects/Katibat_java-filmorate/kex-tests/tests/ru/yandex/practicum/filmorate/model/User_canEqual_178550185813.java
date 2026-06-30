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
import java.lang.Object;

public class User_canEqual_178550185813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;
     Object term1598;

    public User_canEqual_178550185813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1556 = new Long(-6823727938421990489L);
        term1555 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1594 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1555, term1555.getClass(), "id", term1556);
        setField(term1555, term1555.getClass(), "email", "ieCtQFdkii");
        setField(term1555, term1555.getClass(), "login", "dEnhdmILtU");
        setField(term1555, term1555.getClass(), "name", "hoicvmsovO");
        setIntField(term1594, term1594.getClass(), "year", 2012);
        setShortField(term1594, term1594.getClass(), "month", (short) 10);
        setShortField(term1594, term1594.getClass(), "day", (short) 1);
        setField(term1555, term1555.getClass(), "birthday", term1594);
        term1598 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1598;
        callMethod(klass, "canEqual", argTypes, term1555, args);
    }

};


