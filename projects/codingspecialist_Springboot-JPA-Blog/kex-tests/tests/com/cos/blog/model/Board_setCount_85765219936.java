package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Board_setCount_85765219936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22044;
     Object term22047;

    public Board_setCount_85765219936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22044 = newInstance(Class.forName("com.cos.blog.model.Board"));
        setIntField(term22044, term22044.getClass(), "id", 0);
        setField(term22044, term22044.getClass(), "title", null);
        setField(term22044, term22044.getClass(), "content", null);
        setIntField(term22044, term22044.getClass(), "count", 0);
        setField(term22044, term22044.getClass(), "user", null);
        setField(term22044, term22044.getClass(), "replys", null);
        setField(term22044, term22044.getClass(), "createDate", null);
        term22047 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22047;
        callMethod(klass, "setCount", argTypes, term22044, args);
    }

};


