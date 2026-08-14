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

public class Reply_ReplyBuilder_user_166184685212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40584;

    public Reply_ReplyBuilder_user_166184685212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40584 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        setIntField(term40584, term40584.getClass(), "id", 0);
        setField(term40584, term40584.getClass(), "content", null);
        setField(term40584, term40584.getClass(), "board", null);
        setField(term40584, term40584.getClass(), "user", null);
        setField(term40584, term40584.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "user", argTypes, term40584, args);
    }

};


