package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Celebrity_setName_21175206724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17697;

    public Celebrity_setName_21175206724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17697 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17697, term17697.getClass(), "keyNum", 0);
        setField(term17697, term17697.getClass(), "name", null);
        setIntField(term17697, term17697.getClass(), "likeCount", 0);
        setIntField(term17697, term17697.getClass(), "status", 0);
        setField(term17697, term17697.getClass(), "explain", null);
        setField(term17697, term17697.getClass(), "fileUrl", null);
        setField(term17697, term17697.getClass(), "keyHash", null);
        setIntField(term17697, term17697.getClass(), "spot", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term17697, args);
    }

};


