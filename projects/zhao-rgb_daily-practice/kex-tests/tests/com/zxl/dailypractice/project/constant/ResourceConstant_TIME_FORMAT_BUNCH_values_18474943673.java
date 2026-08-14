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

public class ResourceConstant_TIME_FORMAT_BUNCH_values_18474943673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public ResourceConstant_TIME_FORMAT_BUNCH_values_18474943673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term314 = Class.forName((String) "com.zxl.dailypractice.project.constant.ResourceConstant$TIME_FORMAT_BUNCH");
        Field term313 = ((Class) term314).getDeclaredField((String) "YYYY_MM_DD_HH_MI_SS");
        ((Field) term313).setAccessible(true);
        enum0 = ((Field) term313).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.constant.ResourceConstant$TIME_FORMAT_BUNCH");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum0, args);
    }

};


