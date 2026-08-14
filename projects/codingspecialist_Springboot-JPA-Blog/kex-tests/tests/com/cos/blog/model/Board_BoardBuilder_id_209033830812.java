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

public class Board_BoardBuilder_id_209033830812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33933;
     Object term33936;

    public Board_BoardBuilder_id_209033830812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33933 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        setIntField(term33933, term33933.getClass(), "id", 0);
        setField(term33933, term33933.getClass(), "title", null);
        setField(term33933, term33933.getClass(), "content", null);
        setIntField(term33933, term33933.getClass(), "count", 0);
        setField(term33933, term33933.getClass(), "user", null);
        setField(term33933, term33933.getClass(), "replys", null);
        setField(term33933, term33933.getClass(), "createDate", null);
        term33936 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33936;
        callMethod(klass, "id", argTypes, term33933, args);
    }

};


