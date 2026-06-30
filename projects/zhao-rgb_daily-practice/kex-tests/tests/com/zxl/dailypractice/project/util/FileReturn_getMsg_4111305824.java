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

public class FileReturn_getMsg_4111305824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;

    public FileReturn_getMsg_4111305824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("com.zxl.dailypractice.project.util.FileReturn"));
        setIntField(term200, term200.getClass(), "resultCode", -1922583790);
        setField(term200, term200.getClass(), "msg", "hRNSzYYIrc");
        setField(term200, term200.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.util.FileReturn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMsg", argTypes, term200, args);
    }

};


