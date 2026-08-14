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

public class Board_getId_57326300129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22021;

    public Board_getId_57326300129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22021 = newInstance(Class.forName("com.cos.blog.model.Board"));
        setIntField(term22021, term22021.getClass(), "id", 0);
        setField(term22021, term22021.getClass(), "title", null);
        setField(term22021, term22021.getClass(), "content", null);
        setIntField(term22021, term22021.getClass(), "count", 0);
        setField(term22021, term22021.getClass(), "user", null);
        setField(term22021, term22021.getClass(), "replys", null);
        setField(term22021, term22021.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term22021, args);
    }

};


