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

public class Reply_setBoard_181205577328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9275;

    public Reply_setBoard_181205577328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9275 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term9275, term9275.getClass(), "id", 0);
        setField(term9275, term9275.getClass(), "content", null);
        setField(term9275, term9275.getClass(), "board", null);
        setField(term9275, term9275.getClass(), "user", null);
        setField(term9275, term9275.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.Board");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBoard", argTypes, term9275, args);
    }

};


