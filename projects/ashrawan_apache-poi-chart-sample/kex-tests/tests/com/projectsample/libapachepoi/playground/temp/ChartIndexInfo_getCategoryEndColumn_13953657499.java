package com.projectsample.libapachepoi.playground.temp;

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
import static com.projectsample.libapachepoi.playground.temp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChartIndexInfo_getCategoryEndColumn_13953657499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public ChartIndexInfo_getCategoryEndColumn_13953657499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term73, term73.getClass(), "dataStartRow", 458147407);
        setIntField(term73, term73.getClass(), "dataEndRow", -184153539);
        setIntField(term73, term73.getClass(), "dataStartColumn", 493620644);
        setIntField(term73, term73.getClass(), "dataEndColumn", 1328271830);
        setIntField(term73, term73.getClass(), "categoryStartRow", 1596070772);
        setIntField(term73, term73.getClass(), "categoryEndRow", 97029295);
        setIntField(term73, term73.getClass(), "categoryStartColumn", -1371869594);
        setIntField(term73, term73.getClass(), "categoryEndColumn", -2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryEndColumn", argTypes, term73, args);
    }

};


