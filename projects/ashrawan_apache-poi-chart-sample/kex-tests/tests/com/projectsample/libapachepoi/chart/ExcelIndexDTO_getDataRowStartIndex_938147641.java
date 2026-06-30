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

public class ExcelIndexDTO_getDataRowStartIndex_938147641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73466;

    public ExcelIndexDTO_getDataRowStartIndex_938147641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73466 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO"));
        setIntField(term73466, term73466.getClass(), "dataRowStartIndex", -1274456137);
        setIntField(term73466, term73466.getClass(), "dataRowEndIndex", 1041916673);
        setIntField(term73466, term73466.getClass(), "chartRowStartIndex", -601863069);
        setIntField(term73466, term73466.getClass(), "chartRowEndIndex", 663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataRowStartIndex", argTypes, term73466, args);
    }

};


