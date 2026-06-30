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

public class Culture_setName_3753559507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31646;

    public Culture_setName_3753559507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31646 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31646, term31646.getClass(), "keyNum", 993627098);
        setField(term31646, term31646.getClass(), "keyHash", "DGMBBNDEYs");
        setField(term31646, term31646.getClass(), "name", "vpuKZSMmKQ");
        setIntField(term31646, term31646.getClass(), "likeCount", 872295704);
        setIntField(term31646, term31646.getClass(), "status", 86041387);
        setField(term31646, term31646.getClass(), "explain", "IXQQwaXITf");
        setField(term31646, term31646.getClass(), "fileUrl", "fNzFTiRCjp");
        setIntField(term31646, term31646.getClass(), "spot", 1010721666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yaCGGogKro";
        callMethod(klass, "setName", argTypes, term31646, args);
    }

};


