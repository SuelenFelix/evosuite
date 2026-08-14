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

public class Reply_ReplyBuilder_id_28273638010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40578;
     Object term40580;

    public Reply_ReplyBuilder_id_28273638010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40578 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        setIntField(term40578, term40578.getClass(), "id", 0);
        setField(term40578, term40578.getClass(), "content", null);
        setField(term40578, term40578.getClass(), "board", null);
        setField(term40578, term40578.getClass(), "user", null);
        setField(term40578, term40578.getClass(), "createDate", null);
        term40580 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term40580;
        callMethod(klass, "id", argTypes, term40578, args);
    }

};


