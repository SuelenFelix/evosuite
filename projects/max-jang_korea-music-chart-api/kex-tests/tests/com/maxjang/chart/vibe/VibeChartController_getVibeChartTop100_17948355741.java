package com.maxjang.chart.vibe;

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
import static com.maxjang.chart.vibe.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VibeChartController_getVibeChartTop100_17948355741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public VibeChartController_getVibeChartTop100_17948355741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.maxjang.chart.vibe.VibeChartController"));
        Object term3 = newInstance(Class.forName("com.maxjang.chart.vibe.VibeChartService"));
        setField(term2, term2.getClass(), "vibeChartService", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.vibe.VibeChartController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVibeChartTop100", argTypes, term2, args);
    }

};


