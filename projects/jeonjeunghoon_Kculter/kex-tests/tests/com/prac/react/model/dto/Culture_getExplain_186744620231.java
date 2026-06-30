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

public class Culture_getExplain_186744620231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32896;

    public Culture_getExplain_186744620231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32896 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32896, term32896.getClass(), "keyNum", 0);
        setField(term32896, term32896.getClass(), "keyHash", null);
        setField(term32896, term32896.getClass(), "name", null);
        setIntField(term32896, term32896.getClass(), "likeCount", 0);
        setIntField(term32896, term32896.getClass(), "status", 0);
        setField(term32896, term32896.getClass(), "explain", null);
        setField(term32896, term32896.getClass(), "fileUrl", null);
        setIntField(term32896, term32896.getClass(), "spot", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExplain", argTypes, term32896, args);
    }

};


