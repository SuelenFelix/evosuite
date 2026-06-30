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
import java.lang.Integer;

public class ChartIndexInfo_setDataEndRow_44292755931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;
     Object term291;

    public ChartIndexInfo_setDataEndRow_44292755931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term282, term282.getClass(), "dataStartRow", 0);
        setIntField(term282, term282.getClass(), "dataEndRow", 0);
        setIntField(term282, term282.getClass(), "dataStartColumn", 0);
        setIntField(term282, term282.getClass(), "dataEndColumn", 0);
        setIntField(term282, term282.getClass(), "categoryStartRow", 0);
        setIntField(term282, term282.getClass(), "categoryEndRow", 0);
        setIntField(term282, term282.getClass(), "categoryStartColumn", 0);
        setIntField(term282, term282.getClass(), "categoryEndColumn", 0);
        term291 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291;
        callMethod(klass, "setDataEndRow", argTypes, term282, args);
    }

};


