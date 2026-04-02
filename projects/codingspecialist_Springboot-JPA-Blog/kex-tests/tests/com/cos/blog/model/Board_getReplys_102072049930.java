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

public class Board_getReplys_102072049930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20873;

    public Board_getReplys_102072049930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20873 = newInstance(Class.forName("com.cos.blog.model.Board"));
        setIntField(term20873, term20873.getClass(), "id", 0);
        setField(term20873, term20873.getClass(), "title", null);
        setField(term20873, term20873.getClass(), "content", null);
        setIntField(term20873, term20873.getClass(), "count", 0);
        setField(term20873, term20873.getClass(), "user", null);
        setField(term20873, term20873.getClass(), "replys", null);
        setField(term20873, term20873.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReplys", argTypes, term20873, args);
    }

};


