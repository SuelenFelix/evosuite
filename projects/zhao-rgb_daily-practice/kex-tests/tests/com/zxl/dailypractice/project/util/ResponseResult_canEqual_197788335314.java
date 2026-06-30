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

public class ResponseResult_canEqual_197788335314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3215;
     Object term3231;

    public ResponseResult_canEqual_197788335314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3216 = new Integer(1725571209);
        term3215 = newInstance(Class.forName("com.zxl.dailypractice.project.util.ResponseResult"));
        Object term3230 = newInstance(Class.forName("java.lang.Object"));
        setField(term3215, term3215.getClass(), "code", term3216);
        setField(term3215, term3215.getClass(), "msg", "BYqFIqCKAV");
        setField(term3215, term3215.getClass(), "data", term3230);
        term3231 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.util.ResponseResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3231;
        callMethod(klass, "canEqual", argTypes, term3215, args);
    }

};


