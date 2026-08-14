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

public class ChartIndexInfo_getCategoryStartColumn_5534394848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;

    public ChartIndexInfo_getCategoryStartColumn_5534394848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term64, term64.getClass(), "dataStartRow", 579005622);
        setIntField(term64, term64.getClass(), "dataEndRow", -14890619);
        setIntField(term64, term64.getClass(), "dataStartColumn", 1632125673);
        setIntField(term64, term64.getClass(), "dataEndColumn", 454281060);
        setIntField(term64, term64.getClass(), "categoryStartRow", -1786399638);
        setIntField(term64, term64.getClass(), "categoryEndRow", 2055867847);
        setIntField(term64, term64.getClass(), "categoryStartColumn", -1048298087);
        setIntField(term64, term64.getClass(), "categoryEndColumn", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryStartColumn", argTypes, term64, args);
    }

};


