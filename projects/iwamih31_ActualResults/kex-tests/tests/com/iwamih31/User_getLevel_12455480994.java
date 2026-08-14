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

public class User_getLevel_12455480994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1412;

    public User_getLevel_12455480994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1413 = new Integer(-655067527);
        Integer term1415 = new Integer(-6029667);
        term1412 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1445 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1412, term1412.getClass(), "id", term1413);
        setField(term1412, term1412.getClass(), "room", term1415);
        setField(term1412, term1412.getClass(), "name", "MLqYREekMl");
        setIntField(term1429, term1429.getClass(), "year", 2022);
        setShortField(term1429, term1429.getClass(), "month", (short) 2);
        setShortField(term1429, term1429.getClass(), "day", (short) 25);
        setField(term1412, term1412.getClass(), "birthday", term1429);
        setField(term1412, term1412.getClass(), "level", "ytSBIKXogI");
        setIntField(term1445, term1445.getClass(), "year", 2017);
        setShortField(term1445, term1445.getClass(), "month", (short) 7);
        setShortField(term1445, term1445.getClass(), "day", (short) 22);
        setField(term1412, term1412.getClass(), "move_in", term1445);
        setField(term1412, term1412.getClass(), "use", "nHXjMycHlU");
        setField(term1412, term1412.getClass(), "note", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term1412, args);
    }

};


