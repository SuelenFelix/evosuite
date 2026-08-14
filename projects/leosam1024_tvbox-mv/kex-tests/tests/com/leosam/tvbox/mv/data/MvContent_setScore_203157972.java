package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class MvContent_setScore_203157972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term141;

    public MvContent_setScore_203157972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term91, term91.getClass(), "name", "jJCZpVmanW");
        setField(term91, term91.getClass(), "songName", "EGtDIRbSSb");
        setField(term91, term91.getClass(), "songUser", "SzjVpOQTyS");
        setField(term91, term91.getClass(), "url", "MjGYSRKTNF");
        setFloatField(term91, term91.getClass(), "score", 0.2707036F);
        term141 = new Float(0.3455959F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term141;
        callMethod(klass, "setScore", argTypes, term91, args);
    }

};


