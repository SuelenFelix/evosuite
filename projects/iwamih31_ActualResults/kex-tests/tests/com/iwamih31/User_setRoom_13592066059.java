package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class User_setRoom_13592066059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919;
     Object term1980;

    public User_setRoom_13592066059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1920 = new Integer(-1179120542);
        Integer term1922 = new Integer(-73683645);
        term1919 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1952 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1919, term1919.getClass(), "id", term1920);
        setField(term1919, term1919.getClass(), "room", term1922);
        setField(term1919, term1919.getClass(), "name", "vQVyKLdtaz");
        setIntField(term1936, term1936.getClass(), "year", 2022);
        setShortField(term1936, term1936.getClass(), "month", (short) 11);
        setShortField(term1936, term1936.getClass(), "day", (short) 16);
        setField(term1919, term1919.getClass(), "birthday", term1936);
        setField(term1919, term1919.getClass(), "level", "OWKQODBLzb");
        setIntField(term1952, term1952.getClass(), "year", 2024);
        setShortField(term1952, term1952.getClass(), "month", (short) 8);
        setShortField(term1952, term1952.getClass(), "day", (short) 31);
        setField(term1919, term1919.getClass(), "move_in", term1952);
        setField(term1919, term1919.getClass(), "use", "wGmYcqUkgE");
        setField(term1919, term1919.getClass(), "note", "idgaQsnJpQ");
        term1980 = new Integer(-226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1980;
        callMethod(klass, "setRoom", argTypes, term1919, args);
    }

};


