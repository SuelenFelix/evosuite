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

public class Celebrity_getSpot_30856536716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17393;

    public Celebrity_getSpot_30856536716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17393 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17393, term17393.getClass(), "keyNum", -370828664);
        setField(term17393, term17393.getClass(), "name", "dUNzDLXJcj");
        setIntField(term17393, term17393.getClass(), "likeCount", 1168633950);
        setIntField(term17393, term17393.getClass(), "status", 1607082164);
        setField(term17393, term17393.getClass(), "explain", "OrVSjRJVwa");
        setField(term17393, term17393.getClass(), "fileUrl", "cdZEcINJAM");
        setField(term17393, term17393.getClass(), "keyHash", "qumYSwcWHz");
        setIntField(term17393, term17393.getClass(), "spot", 1890399366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpot", argTypes, term17393, args);
    }

};


