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
import java.lang.Integer;

public class Culture_setLikeCount_5914026889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31854;
     Object term31907;

    public Culture_setLikeCount_5914026889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31854 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31854, term31854.getClass(), "keyNum", 1648665618);
        setField(term31854, term31854.getClass(), "keyHash", "mbBWfaHCrP");
        setField(term31854, term31854.getClass(), "name", "wFyiZloCxg");
        setIntField(term31854, term31854.getClass(), "likeCount", 633765954);
        setIntField(term31854, term31854.getClass(), "status", 269110087);
        setField(term31854, term31854.getClass(), "explain", "xYztJEIPWy");
        setField(term31854, term31854.getClass(), "fileUrl", "TDQIAXaJru");
        setIntField(term31854, term31854.getClass(), "spot", 1545119095);
        term31907 = new Integer(1671229683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31907;
        callMethod(klass, "setLikeCount", argTypes, term31854, args);
    }

};


