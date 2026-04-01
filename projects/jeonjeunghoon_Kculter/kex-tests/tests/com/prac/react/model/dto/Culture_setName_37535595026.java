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

public class Culture_setName_37535595026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32867;

    public Culture_setName_37535595026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32867 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32867, term32867.getClass(), "keyNum", 0);
        setField(term32867, term32867.getClass(), "keyHash", null);
        setField(term32867, term32867.getClass(), "name", null);
        setIntField(term32867, term32867.getClass(), "likeCount", 0);
        setIntField(term32867, term32867.getClass(), "status", 0);
        setField(term32867, term32867.getClass(), "explain", null);
        setField(term32867, term32867.getClass(), "fileUrl", null);
        setIntField(term32867, term32867.getClass(), "spot", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term32867, args);
    }

};


