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

public class LocalSearcher_swap2Edges_198637901710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238;
     Object term239;
     Object term241;

    public LocalSearcher_swap2Edges_198637901710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        term239 = new Integer(0);
        term241 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.ants.LocalSearcher");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term239;
        args[2] = term241;
        callMethod(klass, "swap2Edges", argTypes, term238, args);
    }

};


