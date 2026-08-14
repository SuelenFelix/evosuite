package com.zxl.dailypractice.project.constant;

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
import static com.zxl.dailypractice.project.constant.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ResourceConstant_SYSTEM_TIME_FORMAT_values_20178751373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public ResourceConstant_SYSTEM_TIME_FORMAT_values_20178751373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1331 = Class.forName((String) "com.zxl.dailypractice.project.constant.ResourceConstant$SYSTEM_TIME_FORMAT");
        Field term1330 = ((Class) term1331).getDeclaredField((String) "TIME_PRCS");
        ((Field) term1330).setAccessible(true);
        enum2 = ((Field) term1330).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.constant.ResourceConstant$SYSTEM_TIME_FORMAT");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum2, args);
    }

};


