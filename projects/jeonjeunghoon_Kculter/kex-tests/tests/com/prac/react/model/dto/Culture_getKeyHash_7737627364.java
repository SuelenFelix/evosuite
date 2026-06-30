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

public class Culture_getKeyHash_7737627364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31345;

    public Culture_getKeyHash_7737627364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31345 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31345, term31345.getClass(), "keyNum", -314165467);
        setField(term31345, term31345.getClass(), "keyHash", "NSxzAUSujy");
        setField(term31345, term31345.getClass(), "name", "FEezgglqXC");
        setIntField(term31345, term31345.getClass(), "likeCount", 963694071);
        setIntField(term31345, term31345.getClass(), "status", -995785731);
        setField(term31345, term31345.getClass(), "explain", "rvYqMRgiPA");
        setField(term31345, term31345.getClass(), "fileUrl", "qOZXeUUmdz");
        setIntField(term31345, term31345.getClass(), "spot", 1349815364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyHash", argTypes, term31345, args);
    }

};


