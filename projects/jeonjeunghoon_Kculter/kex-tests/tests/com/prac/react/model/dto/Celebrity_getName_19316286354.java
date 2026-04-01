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

public class Celebrity_getName_19316286354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16185;

    public Celebrity_getName_19316286354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16185 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16185, term16185.getClass(), "keyNum", 1988605357);
        setField(term16185, term16185.getClass(), "name", "zHiuLPzYQM");
        setIntField(term16185, term16185.getClass(), "likeCount", 808203320);
        setIntField(term16185, term16185.getClass(), "status", -544382127);
        setField(term16185, term16185.getClass(), "explain", "ioYxUYJBrh");
        setField(term16185, term16185.getClass(), "fileUrl", "GXoLEdKEIe");
        setField(term16185, term16185.getClass(), "keyHash", "EugWXkztim");
        setIntField(term16185, term16185.getClass(), "spot", -1830198043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term16185, args);
    }

};


