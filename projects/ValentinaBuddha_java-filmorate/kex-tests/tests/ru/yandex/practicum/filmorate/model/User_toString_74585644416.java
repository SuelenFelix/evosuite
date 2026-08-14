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

public class User_toString_74585644416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115;

    public User_toString_74585644416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2116 = new Integer(-655067527);
        term2115 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2154 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2115, term2115.getClass(), "id", term2116);
        setField(term2115, term2115.getClass(), "email", "VgZnGoIFwQ");
        setField(term2115, term2115.getClass(), "login", "jUbSRrkrYZ");
        setField(term2115, term2115.getClass(), "name", "bWWfajKbEX");
        setIntField(term2154, term2154.getClass(), "year", 2019);
        setShortField(term2154, term2154.getClass(), "month", (short) 2);
        setShortField(term2154, term2154.getClass(), "day", (short) 20);
        setField(term2115, term2115.getClass(), "birthday", term2154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2115, args);
    }

};


