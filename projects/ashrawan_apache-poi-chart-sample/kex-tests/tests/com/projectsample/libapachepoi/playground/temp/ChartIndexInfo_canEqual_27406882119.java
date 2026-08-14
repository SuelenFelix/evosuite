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

public class ChartIndexInfo_canEqual_27406882119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;
     Object term189;

    public ChartIndexInfo_canEqual_27406882119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term180, term180.getClass(), "dataStartRow", 9726679);
        setIntField(term180, term180.getClass(), "dataEndRow", -25637976);
        setIntField(term180, term180.getClass(), "dataStartColumn", 1555897383);
        setIntField(term180, term180.getClass(), "dataEndColumn", 202001407);
        setIntField(term180, term180.getClass(), "categoryStartRow", 158873461);
        setIntField(term180, term180.getClass(), "categoryEndRow", -430151637);
        setIntField(term180, term180.getClass(), "categoryStartColumn", -1697741339);
        setIntField(term180, term180.getClass(), "categoryEndColumn", 98922530);
        term189 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term189;
        callMethod(klass, "canEqual", argTypes, term180, args);
    }

};


