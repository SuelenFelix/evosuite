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

public class Board_BoardBuilder_replys_204393550016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33949;

    public Board_BoardBuilder_replys_204393550016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33949 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        setIntField(term33949, term33949.getClass(), "id", 0);
        setField(term33949, term33949.getClass(), "title", null);
        setField(term33949, term33949.getClass(), "content", null);
        setIntField(term33949, term33949.getClass(), "count", 0);
        setField(term33949, term33949.getClass(), "user", null);
        setField(term33949, term33949.getClass(), "replys", null);
        setField(term33949, term33949.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "replys", argTypes, term33949, args);
    }

};


