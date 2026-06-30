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

public class ChartIndexInfo_getDataStartRow_5581668001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ChartIndexInfo_getDataStartRow_5581668001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term1, term1.getClass(), "dataStartRow", 568599855);
        setIntField(term1, term1.getClass(), "dataEndRow", 1162663216);
        setIntField(term1, term1.getClass(), "dataStartColumn", 1484323161);
        setIntField(term1, term1.getClass(), "dataEndColumn", 391863371);
        setIntField(term1, term1.getClass(), "categoryStartRow", -1922583790);
        setIntField(term1, term1.getClass(), "categoryEndRow", -616727354);
        setIntField(term1, term1.getClass(), "categoryStartColumn", -1955890973);
        setIntField(term1, term1.getClass(), "categoryEndColumn", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataStartRow", argTypes, term1, args);
    }

};


