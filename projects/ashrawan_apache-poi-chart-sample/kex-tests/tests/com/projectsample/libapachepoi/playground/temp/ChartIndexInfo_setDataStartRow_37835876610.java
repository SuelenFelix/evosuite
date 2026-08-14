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

public class ChartIndexInfo_setDataStartRow_37835876610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term91;

    public ChartIndexInfo_setDataStartRow_37835876610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term82, term82.getClass(), "dataStartRow", 1225272962);
        setIntField(term82, term82.getClass(), "dataEndRow", 1324040357);
        setIntField(term82, term82.getClass(), "dataStartColumn", -1588772968);
        setIntField(term82, term82.getClass(), "dataEndColumn", -93135961);
        setIntField(term82, term82.getClass(), "categoryStartRow", -112921587);
        setIntField(term82, term82.getClass(), "categoryEndRow", 933028652);
        setIntField(term82, term82.getClass(), "categoryStartColumn", 287287233);
        setIntField(term82, term82.getClass(), "categoryEndColumn", 962840079);
        term91 = new Integer(1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term91;
        callMethod(klass, "setDataStartRow", argTypes, term82, args);
    }

};


