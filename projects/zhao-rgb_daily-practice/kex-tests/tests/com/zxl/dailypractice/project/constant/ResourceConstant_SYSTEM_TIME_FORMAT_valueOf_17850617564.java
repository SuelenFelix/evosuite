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

public class ResourceConstant_SYSTEM_TIME_FORMAT_valueOf_17850617564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;

    public ResourceConstant_SYSTEM_TIME_FORMAT_valueOf_17850617564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1737 = Class.forName((String) "com.zxl.dailypractice.project.constant.ResourceConstant$SYSTEM_TIME_FORMAT");
        Field term1736 = ((Class) term1737).getDeclaredField((String) "TIME_PRCS_CMPCT");
        ((Field) term1736).setAccessible(true);
        enum3 = ((Field) term1736).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.constant.ResourceConstant$SYSTEM_TIME_FORMAT");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueOf", argTypes, enum3, args);
    }

};


