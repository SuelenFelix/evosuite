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
import java.lang.Object;

public class MapTest_main_13169085476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;

    public MapTest_main_13169085476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = (Object[]) newArray("java.lang.String", 5);
        setElement(term75, 0, "MuLcgQHgqz");
        setElement(term75, 1, "xxtlPwDYFs");
        setElement(term75, 2, "jJCZpVmanW");
        setElement(term75, 3, "EGtDIRbSSb");
        setElement(term75, 4, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.collection.HashMap.MapTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term75;
        callMethod(klass, "main", argTypes, null, args);
    }

};


