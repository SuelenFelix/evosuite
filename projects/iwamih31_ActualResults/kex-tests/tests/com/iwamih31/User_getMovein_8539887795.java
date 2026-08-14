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

public class User_getMovein_8539887795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1513;

    public User_getMovein_8539887795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1514 = new Integer(-2068769794);
        Integer term1516 = new Integer(-117576464);
        term1513 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1546 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1513, term1513.getClass(), "id", term1514);
        setField(term1513, term1513.getClass(), "room", term1516);
        setField(term1513, term1513.getClass(), "name", "dEnhdmILtU");
        setIntField(term1530, term1530.getClass(), "year", 2026);
        setShortField(term1530, term1530.getClass(), "month", (short) 12);
        setShortField(term1530, term1530.getClass(), "day", (short) 13);
        setField(term1513, term1513.getClass(), "birthday", term1530);
        setField(term1513, term1513.getClass(), "level", "hoicvmsovO");
        setIntField(term1546, term1546.getClass(), "year", 2020);
        setShortField(term1546, term1546.getClass(), "month", (short) 5);
        setShortField(term1546, term1546.getClass(), "day", (short) 14);
        setField(term1513, term1513.getClass(), "move_in", term1546);
        setField(term1513, term1513.getClass(), "use", "eqJfYWRaEL");
        setField(term1513, term1513.getClass(), "note", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMove_in", argTypes, term1513, args);
    }

};


