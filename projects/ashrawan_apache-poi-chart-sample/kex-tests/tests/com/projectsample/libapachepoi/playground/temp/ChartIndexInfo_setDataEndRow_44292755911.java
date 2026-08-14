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

public class ChartIndexInfo_setDataEndRow_44292755911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term102;

    public ChartIndexInfo_setDataEndRow_44292755911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term93, term93.getClass(), "dataStartRow", 1265463001);
        setIntField(term93, term93.getClass(), "dataEndRow", 335112684);
        setIntField(term93, term93.getClass(), "dataStartColumn", 1551099402);
        setIntField(term93, term93.getClass(), "dataEndColumn", -2027534003);
        setIntField(term93, term93.getClass(), "categoryStartRow", 1063420942);
        setIntField(term93, term93.getClass(), "categoryEndRow", 1375330971);
        setIntField(term93, term93.getClass(), "categoryStartColumn", -478195677);
        setIntField(term93, term93.getClass(), "categoryEndColumn", 972867650);
        term102 = new Integer(1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term102;
        callMethod(klass, "setDataEndRow", argTypes, term93, args);
    }

};


