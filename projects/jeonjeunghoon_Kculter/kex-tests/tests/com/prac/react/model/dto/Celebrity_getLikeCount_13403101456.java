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

public class Celebrity_getLikeCount_13403101456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16393;

    public Celebrity_getLikeCount_13403101456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16393 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16393, term16393.getClass(), "keyNum", 787278105);
        setField(term16393, term16393.getClass(), "name", "IXPaHQnEUy");
        setIntField(term16393, term16393.getClass(), "likeCount", -2063843486);
        setIntField(term16393, term16393.getClass(), "status", 833762980);
        setField(term16393, term16393.getClass(), "explain", "zhcWVVrrjs");
        setField(term16393, term16393.getClass(), "fileUrl", "EAMaFLdmaG");
        setField(term16393, term16393.getClass(), "keyHash", "DYZSJMwbhX");
        setIntField(term16393, term16393.getClass(), "spot", 320711637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term16393, args);
    }

};


