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
import java.util.LinkedList;
import java.lang.Integer;
import java.lang.Object;

public class StreamTest_getAverage_94269725410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;

    public StreamTest_getAverage_94269725410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1193 = new Integer(-1685132342);
        Integer term1196 = new Integer(-1456670397);
        Integer term1199 = new Integer(1622346318);
        Integer term1202 = new Integer(1048535127);
        term1190 = new LinkedList();
        ((LinkedList) term1190).add(term1193);
        ((LinkedList) term1190).add(term1196);
        ((LinkedList) term1190).add(term1199);
        ((LinkedList) term1190).add(term1202);
        ((LinkedList) term1190).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.lambda.StreamTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1190;
        callMethod(klass, "getAverage", argTypes, null, args);
    }

};


