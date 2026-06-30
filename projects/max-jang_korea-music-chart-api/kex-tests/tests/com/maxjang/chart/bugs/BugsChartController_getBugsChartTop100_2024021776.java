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

public class BugsChartController_getBugsChartTop100_2024021776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;

    public BugsChartController_getBugsChartTop100_2024021776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("com.maxjang.chart.bugs.BugsChartController"));
        setField(term76, term76.getClass(), "bugsChartService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.bugs.BugsChartController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBugsChartTop100", argTypes, term76, args);
    }

};


