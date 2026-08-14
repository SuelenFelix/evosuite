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

public class User_setBirthday_41248303612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1817;
     Object term1860;

    public User_setBirthday_41248303612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1818 = new Integer(-1685132342);
        term1817 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1856 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1817, term1817.getClass(), "id", term1818);
        setField(term1817, term1817.getClass(), "email", "bLPjGVBhlX");
        setField(term1817, term1817.getClass(), "login", "whBvTVIIlC");
        setField(term1817, term1817.getClass(), "name", "IgRJUzaCwW");
        setIntField(term1856, term1856.getClass(), "year", 2029);
        setShortField(term1856, term1856.getClass(), "month", (short) 1);
        setShortField(term1856, term1856.getClass(), "day", (short) 20);
        setField(term1817, term1817.getClass(), "birthday", term1856);
        term1860 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1860, term1860.getClass(), "year", 2029);
        setShortField(term1860, term1860.getClass(), "month", (short) 8);
        setShortField(term1860, term1860.getClass(), "day", (short) 28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1860;
        callMethod(klass, "setBirthday", argTypes, term1817, args);
    }

};


