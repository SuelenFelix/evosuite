package com.zxl.dailypractice.lambda;

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
import static com.zxl.dailypractice.lambda.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StreamTest_main_12042602311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823;

    public StreamTest_main_12042602311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term823 = (Object[]) newArray("java.lang.String", 9);
        setElement(term823, 0, "xrwlQZdwCp");
        setElement(term823, 1, "IDCWpPLRkE");
        setElement(term823, 2, "nyiiPDVjAc");
        setElement(term823, 3, "aKnKipADSo");
        setElement(term823, 4, "wSQxaModmm");
        setElement(term823, 5, "UlajhuVLaP");
        setElement(term823, 6, "gGSMzuGICf");
        setElement(term823, 7, "hxCBltsObl");
        setElement(term823, 8, "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.lambda.StreamTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term823;
        callMethod(klass, "main", argTypes, null, args);
    }

};


