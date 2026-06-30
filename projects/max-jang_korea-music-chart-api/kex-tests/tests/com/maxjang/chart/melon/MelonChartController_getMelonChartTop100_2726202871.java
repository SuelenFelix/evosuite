package com.maxjang.chart.melon;

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
import static com.maxjang.chart.melon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MelonChartController_getMelonChartTop100_2726202871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public MelonChartController_getMelonChartTop100_2726202871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.maxjang.chart.melon.MelonChartController"));
        Object term3 = newInstance(Class.forName("com.maxjang.chart.melon.MelonChartService"));
        setField(term2, term2.getClass(), "melonChartService", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.melon.MelonChartController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMelonChartTop100", argTypes, term2, args);
    }

};


