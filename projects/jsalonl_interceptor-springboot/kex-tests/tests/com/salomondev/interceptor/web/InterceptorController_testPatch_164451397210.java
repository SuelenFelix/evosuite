package com.salomondev.interceptor.web;

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
import static com.salomondev.interceptor.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InterceptorController_testPatch_164451397210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;

    public InterceptorController_testPatch_164451397210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("com.salomondev.interceptor.web.InterceptorController"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.web.InterceptorController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.salomondev.interceptor.dto.QueryInDto");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testPatch", argTypes, term158, args);
    }

};


