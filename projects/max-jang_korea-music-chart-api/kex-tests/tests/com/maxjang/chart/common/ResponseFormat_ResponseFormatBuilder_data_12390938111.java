package com.maxjang.chart.common;

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
import static com.maxjang.chart.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class ResponseFormat_ResponseFormatBuilder_data_12390938111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3036;
     Object term3041;

    public ResponseFormat_ResponseFormatBuilder_data_12390938111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3037 = new ArrayList();
        term3036 = newInstance(Class.forName("com.maxjang.chart.common.ResponseFormat$ResponseFormatBuilder"));
        setField(term3036, term3036.getClass(), "data", term3037);
        Object term3044 = newInstance(Class.forName("java.lang.Object"));
        term3041 = new LinkedList();
        ((LinkedList) term3041).add(term3044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ResponseFormat$ResponseFormatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3041;
        callMethod(klass, "data", argTypes, term3036, args);
    }

};


