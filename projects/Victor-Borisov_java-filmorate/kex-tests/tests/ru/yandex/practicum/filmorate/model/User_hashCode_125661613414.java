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

public class User_hashCode_125661613414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;

    public User_hashCode_125661613414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1772 = new Integer(458147407);
        term1771 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1810 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1771, term1771.getClass(), "id", term1772);
        setField(term1771, term1771.getClass(), "email", "TJmVBGfTML");
        setField(term1771, term1771.getClass(), "login", "tPlsykYBqO");
        setField(term1771, term1771.getClass(), "name", "bLPjGVBhlX");
        setIntField(term1810, term1810.getClass(), "year", 2024);
        setShortField(term1810, term1810.getClass(), "month", (short) 1);
        setShortField(term1810, term1810.getClass(), "day", (short) 24);
        setField(term1771, term1771.getClass(), "birthday", term1810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1771, args);
    }

};


