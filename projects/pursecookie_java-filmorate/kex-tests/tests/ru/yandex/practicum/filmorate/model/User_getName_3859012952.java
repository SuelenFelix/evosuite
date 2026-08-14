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

public class User_getName_3859012952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739;

    public User_getName_3859012952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term776 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term739, term739.getClass(), "login", "flxyYxBRtu");
        setField(term739, term739.getClass(), "name", "OclPbYPkcH");
        setField(term739, term739.getClass(), "email", "IoAlmYsBwc");
        setIntField(term776, term776.getClass(), "year", 2016);
        setShortField(term776, term776.getClass(), "month", (short) 11);
        setShortField(term776, term776.getClass(), "day", (short) 29);
        setField(term739, term739.getClass(), "birthday", term776);
        setLongField(term739, term739.getClass(), "id", -4443169559037975007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term739, args);
    }

};


