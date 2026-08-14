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

public class ChartIndexInfo_equals_107823145018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;
     Object term179;

    public ChartIndexInfo_equals_107823145018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term170, term170.getClass(), "dataStartRow", 71190297);
        setIntField(term170, term170.getClass(), "dataEndRow", 1202361360);
        setIntField(term170, term170.getClass(), "dataStartColumn", -2015048153);
        setIntField(term170, term170.getClass(), "dataEndColumn", -2063457669);
        setIntField(term170, term170.getClass(), "categoryStartRow", -1222006000);
        setIntField(term170, term170.getClass(), "categoryEndRow", 2095798786);
        setIntField(term170, term170.getClass(), "categoryStartColumn", -1565502840);
        setIntField(term170, term170.getClass(), "categoryEndColumn", 344323424);
        term179 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term179;
        callMethod(klass, "equals", argTypes, term170, args);
    }

};


