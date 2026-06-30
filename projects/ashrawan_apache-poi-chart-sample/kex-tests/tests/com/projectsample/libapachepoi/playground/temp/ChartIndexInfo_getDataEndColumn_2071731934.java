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

public class ChartIndexInfo_getDataEndColumn_2071731934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public ChartIndexInfo_getDataEndColumn_2071731934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term28, term28.getClass(), "dataStartRow", -1007160944);
        setIntField(term28, term28.getClass(), "dataEndRow", 1135664017);
        setIntField(term28, term28.getClass(), "dataStartColumn", 590364439);
        setIntField(term28, term28.getClass(), "dataEndColumn", 865208305);
        setIntField(term28, term28.getClass(), "categoryStartRow", -1275173084);
        setIntField(term28, term28.getClass(), "categoryEndRow", -244121226);
        setIntField(term28, term28.getClass(), "categoryStartColumn", -203030934);
        setIntField(term28, term28.getClass(), "categoryEndColumn", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataEndColumn", argTypes, term28, args);
    }

};


