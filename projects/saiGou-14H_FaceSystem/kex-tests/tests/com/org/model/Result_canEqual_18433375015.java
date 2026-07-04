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

public class Result_canEqual_18433375015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39817;
     Object term39833;

    public Result_canEqual_18433375015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39818 = new Integer(1262425699);
        term39817 = newInstance(Class.forName("com.org.model.Result"));
        Object term39832 = newInstance(Class.forName("java.lang.Object"));
        setField(term39817, term39817.getClass(), "code", term39818);
        setField(term39817, term39817.getClass(), "message", "qoMGJyerSD");
        setField(term39817, term39817.getClass(), "data", term39832);
        term39833 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39833;
        callMethod(klass, "canEqual", argTypes, term39817, args);
    }

};


