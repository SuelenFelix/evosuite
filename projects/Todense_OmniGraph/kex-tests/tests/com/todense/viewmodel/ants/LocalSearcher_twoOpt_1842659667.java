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

public class LocalSearcher_twoOpt_1842659667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;
     Object term222;

    public LocalSearcher_twoOpt_1842659667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        term222 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.ants.LocalSearcher");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.todense.viewmodel.ants.Ant");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[3] = Array.newInstance(Array.newInstance(boolean.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term222;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "twoOpt", argTypes, term221, args);
    }

};


