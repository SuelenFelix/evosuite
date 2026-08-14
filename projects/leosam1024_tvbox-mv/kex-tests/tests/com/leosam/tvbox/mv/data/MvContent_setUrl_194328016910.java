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

public class MvContent_setUrl_194328016910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879;

    public MvContent_setUrl_194328016910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term879 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term879, term879.getClass(), "name", "aKnKipADSo");
        setField(term879, term879.getClass(), "songName", "wSQxaModmm");
        setField(term879, term879.getClass(), "songUser", "UlajhuVLaP");
        setField(term879, term879.getClass(), "url", "gGSMzuGICf");
        setFloatField(term879, term879.getClass(), "score", 0.40176582F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setUrl", argTypes, term879, args);
    }

};


