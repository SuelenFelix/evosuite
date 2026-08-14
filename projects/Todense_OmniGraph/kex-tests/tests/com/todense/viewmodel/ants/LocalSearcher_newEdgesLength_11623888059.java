package com.todense.viewmodel.ants;

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
import static com.todense.viewmodel.ants.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class LocalSearcher_newEdgesLength_11623888059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term228;
     Object term230;
     Object term232;
     Object term234;
     Object term236;

    public LocalSearcher_newEdgesLength_11623888059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        term228 = new Integer(0);
        term230 = new Integer(0);
        term232 = new Integer(0);
        term234 = new Integer(0);
        term236 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.ants.LocalSearcher");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term228;
        args[2] = term230;
        args[3] = term232;
        args[4] = term234;
        args[5] = term236;
        args[6] = null;
        callMethod(klass, "newEdgesLength", argTypes, term227, args);
    }

};


