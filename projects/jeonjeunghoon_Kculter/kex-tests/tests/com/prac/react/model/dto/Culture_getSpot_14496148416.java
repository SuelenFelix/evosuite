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

public class Culture_getSpot_14496148416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32553;

    public Culture_getSpot_14496148416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32553 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32553, term32553.getClass(), "keyNum", 452088587);
        setField(term32553, term32553.getClass(), "keyHash", "mQsaqUltLU");
        setField(term32553, term32553.getClass(), "name", "jwENwZiGlR");
        setIntField(term32553, term32553.getClass(), "likeCount", -1630069454);
        setIntField(term32553, term32553.getClass(), "status", 1499735894);
        setField(term32553, term32553.getClass(), "explain", "rfFHGPcfpz");
        setField(term32553, term32553.getClass(), "fileUrl", "fViQeyMrrL");
        setIntField(term32553, term32553.getClass(), "spot", 716486048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpot", argTypes, term32553, args);
    }

};


