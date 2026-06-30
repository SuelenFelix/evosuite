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

public class ChartIndexInfo_setDataEndColumn_113083409912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term115;

    public ChartIndexInfo_setDataEndColumn_113083409912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term106, term106.getClass(), "dataStartRow", -1845499264);
        setIntField(term106, term106.getClass(), "dataEndRow", -505439934);
        setIntField(term106, term106.getClass(), "dataStartColumn", -344842608);
        setIntField(term106, term106.getClass(), "dataEndColumn", 941650513);
        setIntField(term106, term106.getClass(), "categoryStartRow", 444029505);
        setIntField(term106, term106.getClass(), "categoryEndRow", -1034506028);
        setIntField(term106, term106.getClass(), "categoryStartColumn", -1263114719);
        setIntField(term106, term106.getClass(), "categoryEndColumn", -894662986);
        term115 = new Integer(304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term115;
        callMethod(klass, "setDataEndColumn", argTypes, term106, args);
    }

};


