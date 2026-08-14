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

public class MvContent_setSongName_118959437017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003;

    public MvContent_setSongName_118959437017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1003 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term1003, term1003.getClass(), "name", null);
        setField(term1003, term1003.getClass(), "songName", null);
        setField(term1003, term1003.getClass(), "songUser", null);
        setField(term1003, term1003.getClass(), "url", null);
        setFloatField(term1003, term1003.getClass(), "score", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSongName", argTypes, term1003, args);
    }

};


