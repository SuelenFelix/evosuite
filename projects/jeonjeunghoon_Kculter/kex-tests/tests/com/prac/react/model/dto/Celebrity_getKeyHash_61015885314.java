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

public class Celebrity_getKeyHash_61015885314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17185;

    public Celebrity_getKeyHash_61015885314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17185 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17185, term17185.getClass(), "keyNum", -97742366);
        setField(term17185, term17185.getClass(), "name", "xqIbVsUspl");
        setIntField(term17185, term17185.getClass(), "likeCount", 1638851942);
        setIntField(term17185, term17185.getClass(), "status", 1374790203);
        setField(term17185, term17185.getClass(), "explain", "GnjLRtJywq");
        setField(term17185, term17185.getClass(), "fileUrl", "TDaodpHTRK");
        setField(term17185, term17185.getClass(), "keyHash", "JayazbYDLK");
        setIntField(term17185, term17185.getClass(), "spot", 1160010161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyHash", argTypes, term17185, args);
    }

};


