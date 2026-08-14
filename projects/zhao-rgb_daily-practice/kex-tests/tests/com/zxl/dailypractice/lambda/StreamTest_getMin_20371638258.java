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

public class StreamTest_getMin_20371638258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1139;

    public StreamTest_getMin_20371638258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1142 = new Integer(568599855);
        Integer term1145 = new Integer(1162663216);
        Integer term1148 = new Integer(1484323161);
        Integer term1151 = new Integer(391863371);
        term1139 = new LinkedList();
        ((LinkedList) term1139).add(term1142);
        ((LinkedList) term1139).add(term1145);
        ((LinkedList) term1139).add(term1148);
        ((LinkedList) term1139).add(term1151);
        ((LinkedList) term1139).add((Object)null);
        ((LinkedList) term1139).add((Object)null);
        ((LinkedList) term1139).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.lambda.StreamTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1139;
        callMethod(klass, "getMin", argTypes, null, args);
    }

};


