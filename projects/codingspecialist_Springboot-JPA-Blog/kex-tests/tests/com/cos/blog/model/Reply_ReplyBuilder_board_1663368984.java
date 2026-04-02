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

public class Reply_ReplyBuilder_board_1663368984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38368;

    public Reply_ReplyBuilder_board_1663368984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38368 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        setIntField(term38368, term38368.getClass(), "id", 0);
        setField(term38368, term38368.getClass(), "content", null);
        setField(term38368, term38368.getClass(), "board", null);
        setField(term38368, term38368.getClass(), "user", null);
        setField(term38368, term38368.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.Board");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "board", argTypes, term38368, args);
    }

};


