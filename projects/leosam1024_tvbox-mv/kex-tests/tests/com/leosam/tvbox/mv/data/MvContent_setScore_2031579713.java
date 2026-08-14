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

public class MvContent_setScore_2031579713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term993;
     Object term995;

    public MvContent_setScore_2031579713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term993 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term993, term993.getClass(), "name", null);
        setField(term993, term993.getClass(), "songName", null);
        setField(term993, term993.getClass(), "songUser", null);
        setField(term993, term993.getClass(), "url", null);
        setFloatField(term993, term993.getClass(), "score", 0.0F);
        term995 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term995;
        callMethod(klass, "setScore", argTypes, term993, args);
    }

};


