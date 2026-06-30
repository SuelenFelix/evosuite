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

public class ExcelIndexDTO_toString_139558550912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73531;

    public ExcelIndexDTO_toString_139558550912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73531 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO"));
        setIntField(term73531, term73531.getClass(), "dataRowStartIndex", 880977281);
        setIntField(term73531, term73531.getClass(), "dataRowEndIndex", 371943306);
        setIntField(term73531, term73531.getClass(), "chartRowStartIndex", 982388293);
        setIntField(term73531, term73531.getClass(), "chartRowEndIndex", -159494544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term73531, args);
    }

};


