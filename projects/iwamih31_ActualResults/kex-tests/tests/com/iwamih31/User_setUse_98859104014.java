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

public class User_setUse_98859104014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2478;

    public User_setUse_98859104014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2479 = new Integer(-602026508);
        Integer term2481 = new Integer(-157887805);
        term2478 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2511 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2478, term2478.getClass(), "id", term2479);
        setField(term2478, term2478.getClass(), "room", term2481);
        setField(term2478, term2478.getClass(), "name", "BKLfkLiZTH");
        setIntField(term2495, term2495.getClass(), "year", 2017);
        setShortField(term2495, term2495.getClass(), "month", (short) 6);
        setShortField(term2495, term2495.getClass(), "day", (short) 7);
        setField(term2478, term2478.getClass(), "birthday", term2495);
        setField(term2478, term2478.getClass(), "level", "SPpkrGcPRr");
        setIntField(term2511, term2511.getClass(), "year", 2023);
        setShortField(term2511, term2511.getClass(), "month", (short) 8);
        setShortField(term2511, term2511.getClass(), "day", (short) 12);
        setField(term2478, term2478.getClass(), "move_in", term2511);
        setField(term2478, term2478.getClass(), "use", "sEccwbJKYE");
        setField(term2478, term2478.getClass(), "note", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "setUse", argTypes, term2478, args);
    }

};


