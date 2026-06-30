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

public class ResponseResult_hashCode_106423463915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;

    public ResponseResult_hashCode_106423463915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3243 = new Integer(-522618178);
        term3242 = newInstance(Class.forName("com.zxl.dailypractice.project.util.ResponseResult"));
        Object term3257 = newInstance(Class.forName("java.lang.Object"));
        setField(term3242, term3242.getClass(), "code", term3243);
        setField(term3242, term3242.getClass(), "msg", "vrQLuWIDJX");
        setField(term3242, term3242.getClass(), "data", term3257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.util.ResponseResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3242, args);
    }

};


