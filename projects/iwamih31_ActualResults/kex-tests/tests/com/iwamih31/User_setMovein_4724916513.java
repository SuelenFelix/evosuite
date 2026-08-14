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

public class User_setMovein_4724916513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2373;
     Object term2434;

    public User_setMovein_4724916513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2374 = new Integer(1962444399);
        Integer term2376 = new Integer(767834723);
        term2373 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2406 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2373, term2373.getClass(), "id", term2374);
        setField(term2373, term2373.getClass(), "room", term2376);
        setField(term2373, term2373.getClass(), "name", "DfISiziTgG");
        setIntField(term2390, term2390.getClass(), "year", 2025);
        setShortField(term2390, term2390.getClass(), "month", (short) 2);
        setShortField(term2390, term2390.getClass(), "day", (short) 13);
        setField(term2373, term2373.getClass(), "birthday", term2390);
        setField(term2373, term2373.getClass(), "level", "XqgfKFvPSD");
        setIntField(term2406, term2406.getClass(), "year", 2012);
        setShortField(term2406, term2406.getClass(), "month", (short) 2);
        setShortField(term2406, term2406.getClass(), "day", (short) 19);
        setField(term2373, term2373.getClass(), "move_in", term2406);
        setField(term2373, term2373.getClass(), "use", "JiVRgTZvKc");
        setField(term2373, term2373.getClass(), "note", "XPKmummaqg");
        term2434 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2434, term2434.getClass(), "year", 2012);
        setShortField(term2434, term2434.getClass(), "month", (short) 4);
        setShortField(term2434, term2434.getClass(), "day", (short) 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2434;
        callMethod(klass, "setMove_in", argTypes, term2373, args);
    }

};


