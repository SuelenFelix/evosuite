package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Result_setCode_150396543811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39687;
     Object term39703;

    public Result_setCode_150396543811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39688 = new Integer(-1256668289);
        term39687 = newInstance(Class.forName("com.org.model.Result"));
        Object term39702 = newInstance(Class.forName("java.lang.Object"));
        setField(term39687, term39687.getClass(), "code", term39688);
        setField(term39687, term39687.getClass(), "message", "ORAFZEKabw");
        setField(term39687, term39687.getClass(), "data", term39702);
        term39703 = new Integer(-1377964851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term39703;
        callMethod(klass, "setCode", argTypes, term39687, args);
    }

};


