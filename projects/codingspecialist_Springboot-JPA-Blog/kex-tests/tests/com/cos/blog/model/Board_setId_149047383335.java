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

public class Board_setId_149047383335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22039;
     Object term22042;

    public Board_setId_149047383335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22039 = newInstance(Class.forName("com.cos.blog.model.Board"));
        setIntField(term22039, term22039.getClass(), "id", 0);
        setField(term22039, term22039.getClass(), "title", null);
        setField(term22039, term22039.getClass(), "content", null);
        setIntField(term22039, term22039.getClass(), "count", 0);
        setField(term22039, term22039.getClass(), "user", null);
        setField(term22039, term22039.getClass(), "replys", null);
        setField(term22039, term22039.getClass(), "createDate", null);
        term22042 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22042;
        callMethod(klass, "setId", argTypes, term22039, args);
    }

};


