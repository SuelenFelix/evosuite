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

public class ChartIndexInfo_getDataStartColumn_11616939043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;

    public ChartIndexInfo_getDataStartColumn_11616939043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term19, term19.getClass(), "dataStartRow", -1685132342);
        setIntField(term19, term19.getClass(), "dataEndRow", -1456670397);
        setIntField(term19, term19.getClass(), "dataStartColumn", 1622346318);
        setIntField(term19, term19.getClass(), "dataEndColumn", 1048535127);
        setIntField(term19, term19.getClass(), "categoryStartRow", -655067527);
        setIntField(term19, term19.getClass(), "categoryEndRow", -6029667);
        setIntField(term19, term19.getClass(), "categoryStartColumn", -2068769794);
        setIntField(term19, term19.getClass(), "categoryEndColumn", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataStartColumn", argTypes, term19, args);
    }

};


