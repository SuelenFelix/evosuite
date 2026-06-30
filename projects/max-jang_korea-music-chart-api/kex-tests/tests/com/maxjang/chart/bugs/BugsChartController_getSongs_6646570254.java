package com.maxjang.chart.bugs;

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
import static com.maxjang.chart.bugs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BugsChartController_getSongs_6646570254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;

    public BugsChartController_getSongs_6646570254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52 = newInstance(Class.forName("com.maxjang.chart.bugs.BugsChartController"));
        Object term53 = newInstance(Class.forName("com.maxjang.chart.bugs.BugsChartService"));
        setField(term52, term52.getClass(), "bugsChartService", term53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.bugs.BugsChartController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "getSongs", argTypes, term52, args);
    }

};


