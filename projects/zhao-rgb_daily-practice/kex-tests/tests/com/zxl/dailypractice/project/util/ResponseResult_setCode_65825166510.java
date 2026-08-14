package com.zxl.dailypractice.project.util;

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
import static com.zxl.dailypractice.project.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class ResponseResult_setCode_65825166510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3085;
     Object term3101;

    public ResponseResult_setCode_65825166510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3086 = new Integer(-616727354);
        term3085 = newInstance(Class.forName("com.zxl.dailypractice.project.util.ResponseResult"));
        Object term3100 = newInstance(Class.forName("java.lang.Object"));
        setField(term3085, term3085.getClass(), "code", term3086);
        setField(term3085, term3085.getClass(), "msg", "pCTimMblYc");
        setField(term3085, term3085.getClass(), "data", term3100);
        term3101 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.util.ResponseResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3101;
        callMethod(klass, "setCode", argTypes, term3085, args);
    }

};


