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

public class Celebrity_setFileUrl_42650419113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17070;

    public Celebrity_setFileUrl_42650419113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17070 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17070, term17070.getClass(), "keyNum", 464181937);
        setField(term17070, term17070.getClass(), "name", "wzSukELQFL");
        setIntField(term17070, term17070.getClass(), "likeCount", -1455526612);
        setIntField(term17070, term17070.getClass(), "status", -941356098);
        setField(term17070, term17070.getClass(), "explain", "VZyeaOWYEj");
        setField(term17070, term17070.getClass(), "fileUrl", "PErxMBQSUv");
        setField(term17070, term17070.getClass(), "keyHash", "KZQwbvujui");
        setIntField(term17070, term17070.getClass(), "spot", -201517446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JPUZuGxKlI";
        callMethod(klass, "setFileUrl", argTypes, term17070, args);
    }

};


