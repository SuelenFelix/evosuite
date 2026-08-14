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

public class Board_BoardBuilder_user_7112278366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32247;

    public Board_BoardBuilder_user_7112278366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32247 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        setIntField(term32247, term32247.getClass(), "id", 0);
        setField(term32247, term32247.getClass(), "title", null);
        setField(term32247, term32247.getClass(), "content", null);
        setIntField(term32247, term32247.getClass(), "count", 0);
        setField(term32247, term32247.getClass(), "user", null);
        setField(term32247, term32247.getClass(), "replys", null);
        setField(term32247, term32247.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "user", argTypes, term32247, args);
    }

};


