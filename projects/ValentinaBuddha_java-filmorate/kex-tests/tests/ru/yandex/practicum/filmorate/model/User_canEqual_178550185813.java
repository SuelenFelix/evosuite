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
import java.lang.Integer;
import java.lang.Object;

public class User_canEqual_178550185813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1473;
     Object term1516;

    public User_canEqual_178550185813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1474 = new Integer(-883034806);
        term1473 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1512 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1473, term1473.getClass(), "id", term1474);
        setField(term1473, term1473.getClass(), "email", "nHXjMycHlU");
        setField(term1473, term1473.getClass(), "login", "ieCtQFdkii");
        setField(term1473, term1473.getClass(), "name", "dEnhdmILtU");
        setIntField(term1512, term1512.getClass(), "year", 2012);
        setShortField(term1512, term1512.getClass(), "month", (short) 10);
        setShortField(term1512, term1512.getClass(), "day", (short) 1);
        setField(term1473, term1473.getClass(), "birthday", term1512);
        term1516 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1516;
        callMethod(klass, "canEqual", argTypes, term1473, args);
    }

};


