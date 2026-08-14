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

public class User_getNote_16958725537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1715;

    public User_getNote_16958725537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1716 = new Integer(590364439);
        Integer term1718 = new Integer(865208305);
        term1715 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1748 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1715, term1715.getClass(), "id", term1716);
        setField(term1715, term1715.getClass(), "room", term1718);
        setField(term1715, term1715.getClass(), "name", "bLPjGVBhlX");
        setIntField(term1732, term1732.getClass(), "year", 2024);
        setShortField(term1732, term1732.getClass(), "month", (short) 1);
        setShortField(term1732, term1732.getClass(), "day", (short) 24);
        setField(term1715, term1715.getClass(), "birthday", term1732);
        setField(term1715, term1715.getClass(), "level", "whBvTVIIlC");
        setIntField(term1748, term1748.getClass(), "year", 2029);
        setShortField(term1748, term1748.getClass(), "month", (short) 1);
        setShortField(term1748, term1748.getClass(), "day", (short) 20);
        setField(term1715, term1715.getClass(), "move_in", term1748);
        setField(term1715, term1715.getClass(), "use", "IgRJUzaCwW");
        setField(term1715, term1715.getClass(), "note", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNote", argTypes, term1715, args);
    }

};


