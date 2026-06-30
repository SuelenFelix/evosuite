package com.zxl.dailypractice.collection.HashMap;

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
import static com.zxl.dailypractice.collection.HashMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class MapTest_testPut_13568018341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public MapTest_testPut_13568018341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46 = new HashMap();
        term45 = newInstance(Class.forName("com.zxl.dailypractice.collection.HashMap.MapTest"));
        setField(term45, term45.getClass(), "courses", term46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.collection.HashMap.MapTest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "testPut", argTypes, term45, args);
    }

};


