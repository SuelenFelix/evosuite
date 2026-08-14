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

public class User_toString_57725264519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3029;

    public User_toString_57725264519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3030 = new Integer(-1786399638);
        Integer term3032 = new Integer(2055867847);
        term3029 = newInstance(Class.forName("com.iwamih31.User"));
        Object term3046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3062 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term3029, term3029.getClass(), "id", term3030);
        setField(term3029, term3029.getClass(), "room", term3032);
        setField(term3029, term3029.getClass(), "name", "hCWPJQKpdc");
        setIntField(term3046, term3046.getClass(), "year", 2014);
        setShortField(term3046, term3046.getClass(), "month", (short) 7);
        setShortField(term3046, term3046.getClass(), "day", (short) 13);
        setField(term3029, term3029.getClass(), "birthday", term3046);
        setField(term3029, term3029.getClass(), "level", "WzMEhMXkKx");
        setIntField(term3062, term3062.getClass(), "year", 2027);
        setShortField(term3062, term3062.getClass(), "month", (short) 10);
        setShortField(term3062, term3062.getClass(), "day", (short) 4);
        setField(term3029, term3029.getClass(), "move_in", term3062);
        setField(term3029, term3029.getClass(), "use", "XOiDvlDhdc");
        setField(term3029, term3029.getClass(), "note", "AdxvLJhNLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3029, args);
    }

};


