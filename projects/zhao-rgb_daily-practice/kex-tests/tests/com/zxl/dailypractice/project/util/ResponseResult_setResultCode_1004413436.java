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
import java.lang.String;

public class ResponseResult_setResultCode_1004413436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;
     Object enum2;

    public ResponseResult_setResultCode_1004413436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2674 = new Integer(1162663216);
        term2673 = newInstance(Class.forName("com.zxl.dailypractice.project.util.ResponseResult"));
        Object term2688 = newInstance(Class.forName("java.lang.Object"));
        setField(term2673, term2673.getClass(), "code", term2674);
        setField(term2673, term2673.getClass(), "msg", "aJlieCFVtF");
        setField(term2673, term2673.getClass(), "data", term2688);
        Class<? extends Object> term2740 = Class.forName((String) "com.zxl.dailypractice.project.util.ResultCode");
        Field term2739 = ((Class) term2740).getDeclaredField((String) "SYSTEM_ERROR");
        ((Field) term2739).setAccessible(true);
        enum2 = ((Field) term2739).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.util.ResponseResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.project.util.ResultCode");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "setResultCode", argTypes, term2673, args);
    }

};


