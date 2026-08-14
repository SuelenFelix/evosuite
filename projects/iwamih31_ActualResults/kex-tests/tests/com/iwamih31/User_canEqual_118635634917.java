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

public class User_canEqual_118635634917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2826;
     Object term2887;

    public User_canEqual_118635634917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2827 = new Integer(579005622);
        Integer term2829 = new Integer(-14890619);
        term2826 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2859 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2826, term2826.getClass(), "id", term2827);
        setField(term2826, term2826.getClass(), "room", term2829);
        setField(term2826, term2826.getClass(), "name", "RYdKCNNMBR");
        setIntField(term2843, term2843.getClass(), "year", 2017);
        setShortField(term2843, term2843.getClass(), "month", (short) 3);
        setShortField(term2843, term2843.getClass(), "day", (short) 5);
        setField(term2826, term2826.getClass(), "birthday", term2843);
        setField(term2826, term2826.getClass(), "level", "yGtHPyvYiQ");
        setIntField(term2859, term2859.getClass(), "year", 2011);
        setShortField(term2859, term2859.getClass(), "month", (short) 7);
        setShortField(term2859, term2859.getClass(), "day", (short) 24);
        setField(term2826, term2826.getClass(), "move_in", term2859);
        setField(term2826, term2826.getClass(), "use", "MvRIxilFMJ");
        setField(term2826, term2826.getClass(), "note", "iNwOJRBEjp");
        term2887 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2887;
        callMethod(klass, "canEqual", argTypes, term2826, args);
    }

};


