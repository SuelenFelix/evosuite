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

public class StreamTest_getSum_20312661689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;

    public StreamTest_getSum_20312661689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1166 = new Integer(-2038273078);
        Integer term1169 = new Integer(1227103734);
        Integer term1172 = new Integer(-1339778481);
        Integer term1175 = new Integer(1725571209);
        term1163 = new LinkedList();
        ((LinkedList) term1163).add(term1166);
        ((LinkedList) term1163).add(term1169);
        ((LinkedList) term1163).add(term1172);
        ((LinkedList) term1163).add(term1175);
        ((LinkedList) term1163).add((Object)null);
        ((LinkedList) term1163).add((Object)null);
        ((LinkedList) term1163).add((Object)null);
        ((LinkedList) term1163).add((Object)null);
        ((LinkedList) term1163).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.lambda.StreamTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1163;
        callMethod(klass, "getSum", argTypes, null, args);
    }

};


