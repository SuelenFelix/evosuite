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

public class Culture_setKeyHash_15852437605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31438;

    public Culture_setKeyHash_15852437605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31438 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31438, term31438.getClass(), "keyNum", 2128383340);
        setField(term31438, term31438.getClass(), "keyHash", "FCovVZHqPx");
        setField(term31438, term31438.getClass(), "name", "jSTBfkWjge");
        setIntField(term31438, term31438.getClass(), "likeCount", 1238598518);
        setIntField(term31438, term31438.getClass(), "status", -558146961);
        setField(term31438, term31438.getClass(), "explain", "uKYhZULSHp");
        setField(term31438, term31438.getClass(), "fileUrl", "xdYuLllgpn");
        setIntField(term31438, term31438.getClass(), "spot", 1505480070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ayonlqalLA";
        callMethod(klass, "setKeyHash", argTypes, term31438, args);
    }

};


