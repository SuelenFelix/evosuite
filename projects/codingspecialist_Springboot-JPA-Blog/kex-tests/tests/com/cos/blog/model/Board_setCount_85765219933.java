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

public class Board_setCount_85765219933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20884;
     Object term20887;

    public Board_setCount_85765219933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20884 = newInstance(Class.forName("com.cos.blog.model.Board"));
        setIntField(term20884, term20884.getClass(), "id", 0);
        setField(term20884, term20884.getClass(), "title", null);
        setField(term20884, term20884.getClass(), "content", null);
        setIntField(term20884, term20884.getClass(), "count", 0);
        setField(term20884, term20884.getClass(), "user", null);
        setField(term20884, term20884.getClass(), "replys", null);
        setField(term20884, term20884.getClass(), "createDate", null);
        term20887 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20887;
        callMethod(klass, "setCount", argTypes, term20884, args);
    }

};


