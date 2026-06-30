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

public class DetailVO_DetailVOBuilder_title_4011986361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;

    public DetailVO_DetailVOBuilder_title_4011986361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3059 = newInstance(Class.forName("com.maxjang.chart.common.DetailVO$DetailVOBuilder"));
        setField(term3059, term3059.getClass(), "title", "xJgPlLxpgC");
        setField(term3059, term3059.getClass(), "number", "EYtfuJaxiM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.DetailVO$DetailVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gCWtLVKVVe";
        callMethod(klass, "title", argTypes, term3059, args);
    }

};


