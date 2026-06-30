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
import java.lang.Integer;

public class ExcelIndexDTO_setDataRowEndIndex_5333476856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73493;
     Object term73498;

    public ExcelIndexDTO_setDataRowEndIndex_5333476856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73493 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO"));
        setIntField(term73493, term73493.getClass(), "dataRowStartIndex", 497269071);
        setIntField(term73493, term73493.getClass(), "dataRowEndIndex", -1899301124);
        setIntField(term73493, term73493.getClass(), "chartRowStartIndex", -1882480155);
        setIntField(term73493, term73493.getClass(), "chartRowEndIndex", -1410220680);
        term73498 = new Integer(389427431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73498;
        callMethod(klass, "setDataRowEndIndex", argTypes, term73493, args);
    }

};


