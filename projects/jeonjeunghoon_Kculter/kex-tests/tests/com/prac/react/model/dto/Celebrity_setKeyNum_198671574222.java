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

public class Celebrity_setKeyNum_198671574222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17685;
     Object term17690;

    public Celebrity_setKeyNum_198671574222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17685 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17685, term17685.getClass(), "keyNum", 0);
        setField(term17685, term17685.getClass(), "name", null);
        setIntField(term17685, term17685.getClass(), "likeCount", 0);
        setIntField(term17685, term17685.getClass(), "status", 0);
        setField(term17685, term17685.getClass(), "explain", null);
        setField(term17685, term17685.getClass(), "fileUrl", null);
        setField(term17685, term17685.getClass(), "keyHash", null);
        setIntField(term17685, term17685.getClass(), "spot", 0);
        term17690 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17690;
        callMethod(klass, "setKeyNum", argTypes, term17685, args);
    }

};


