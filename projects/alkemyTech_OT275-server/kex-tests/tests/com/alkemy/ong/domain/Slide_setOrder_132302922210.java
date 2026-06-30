package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class Slide_setOrder_132302922210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13076;
     Object term13129;

    public Slide_setOrder_132302922210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13077 = new Long(753095050088595263L);
        Integer term13091 = new Integer(-894662986);
        term13076 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term13076, term13076.getClass(), "id", term13077);
        setField(term13076, term13076.getClass(), "imageUrl", "unvQfYuBUz");
        setField(term13076, term13076.getClass(), "order", term13091);
        setField(term13076, term13076.getClass(), "text", "RqnYUpQBbG");
        setField(term13076, term13076.getClass(), "base64FileEncoded", "sKnuhmcjCC");
        setField(term13076, term13076.getClass(), "contentType", "oCBbVNwMnb");
        term13129 = new Integer(304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13129;
        callMethod(klass, "setOrder", argTypes, term13076, args);
    }

};


