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
import java.util.ArrayList;
import java.lang.Integer;

public class LocalSearcher_swap2Edges_19863790174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term196;
     Object term200;
     Object term202;

    public LocalSearcher_swap2Edges_19863790174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        term196 = new ArrayList();
        term200 = new Integer(-2038273078);
        term202 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.ants.LocalSearcher");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term196;
        args[1] = term200;
        args[2] = term202;
        callMethod(klass, "swap2Edges", argTypes, term195, args);
    }

};


