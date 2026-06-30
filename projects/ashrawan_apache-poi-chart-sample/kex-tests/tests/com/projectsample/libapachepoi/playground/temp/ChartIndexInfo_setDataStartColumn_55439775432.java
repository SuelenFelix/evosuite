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

public class ChartIndexInfo_setDataStartColumn_55439775432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;
     Object term302;

    public ChartIndexInfo_setDataStartColumn_55439775432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term293, term293.getClass(), "dataStartRow", 0);
        setIntField(term293, term293.getClass(), "dataEndRow", 0);
        setIntField(term293, term293.getClass(), "dataStartColumn", 0);
        setIntField(term293, term293.getClass(), "dataEndColumn", 0);
        setIntField(term293, term293.getClass(), "categoryStartRow", 0);
        setIntField(term293, term293.getClass(), "categoryEndRow", 0);
        setIntField(term293, term293.getClass(), "categoryStartColumn", 0);
        setIntField(term293, term293.getClass(), "categoryEndColumn", 0);
        term302 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term302;
        callMethod(klass, "setDataStartColumn", argTypes, term293, args);
    }

};


