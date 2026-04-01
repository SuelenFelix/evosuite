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

public class Culture_toString_96347477937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32928;

    public Culture_toString_96347477937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32928 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32928, term32928.getClass(), "keyNum", 0);
        setField(term32928, term32928.getClass(), "keyHash", null);
        setField(term32928, term32928.getClass(), "name", null);
        setIntField(term32928, term32928.getClass(), "likeCount", 0);
        setIntField(term32928, term32928.getClass(), "status", 0);
        setField(term32928, term32928.getClass(), "explain", null);
        setField(term32928, term32928.getClass(), "fileUrl", null);
        setIntField(term32928, term32928.getClass(), "spot", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term32928, args);
    }

};


