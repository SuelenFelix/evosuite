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

public class Board_builder_169526803128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22018;

    public Board_builder_169526803128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22018 = newInstance(Class.forName("com.cos.blog.model.Board"));
        setIntField(term22018, term22018.getClass(), "id", 0);
        setField(term22018, term22018.getClass(), "title", null);
        setField(term22018, term22018.getClass(), "content", null);
        setIntField(term22018, term22018.getClass(), "count", 0);
        setField(term22018, term22018.getClass(), "user", null);
        setField(term22018, term22018.getClass(), "replys", null);
        setField(term22018, term22018.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term22018, args);
    }

};


