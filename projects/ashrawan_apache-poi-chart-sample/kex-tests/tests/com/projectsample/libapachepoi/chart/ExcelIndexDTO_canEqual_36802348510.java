package com.projectsample.libapachepoi.chart;

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
import static com.projectsample.libapachepoi.chart.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExcelIndexDTO_canEqual_36802348510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73520;
     Object term73525;

    public ExcelIndexDTO_canEqual_36802348510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73520 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO"));
        setIntField(term73520, term73520.getClass(), "dataRowStartIndex", 806595993);
        setIntField(term73520, term73520.getClass(), "dataRowEndIndex", 548228925);
        setIntField(term73520, term73520.getClass(), "chartRowStartIndex", -749861210);
        setIntField(term73520, term73520.getClass(), "chartRowEndIndex", 1694224101);
        term73525 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term73525;
        callMethod(klass, "canEqual", argTypes, term73520, args);
    }

};


