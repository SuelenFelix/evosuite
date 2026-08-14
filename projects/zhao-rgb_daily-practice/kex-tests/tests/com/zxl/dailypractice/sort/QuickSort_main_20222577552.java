package com.zxl.dailypractice.sort;

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
import static com.zxl.dailypractice.sort.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class QuickSort_main_20222577552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public QuickSort_main_20222577552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = (Object[]) newArray("java.lang.String", 6);
        setElement(term210, 0, "hRNSzYYIrc");
        setElement(term210, 1, "RMFIsYGgne");
        setElement(term210, 2, "NRdvgJlhkX");
        setElement(term210, 3, "uuaPigETmJ");
        setElement(term210, 4, "MxlszYVzRf");
        setElement(term210, 5, "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.sort.QuickSort");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term210;
        callMethod(klass, "main", argTypes, null, args);
    }

};


