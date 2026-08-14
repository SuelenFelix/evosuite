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

public class MvContent_getName_70418254614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997;

    public MvContent_getName_70418254614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term997, term997.getClass(), "name", null);
        setField(term997, term997.getClass(), "songName", null);
        setField(term997, term997.getClass(), "songUser", null);
        setField(term997, term997.getClass(), "url", null);
        setFloatField(term997, term997.getClass(), "score", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term997, args);
    }

};


