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

public class ChartIndexInfo_setDataEndRow_44292755910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75803;
     Object term75812;

    public ChartIndexInfo_setDataEndRow_44292755910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75803 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75803, term75803.getClass(), "dataStartRow", 32185364);
        setIntField(term75803, term75803.getClass(), "dataEndRow", 1768204942);
        setIntField(term75803, term75803.getClass(), "dataStartColumn", 1252951645);
        setIntField(term75803, term75803.getClass(), "dataEndColumn", 574481092);
        setIntField(term75803, term75803.getClass(), "categoryStartRow", -310528004);
        setIntField(term75803, term75803.getClass(), "categoryEndRow", -634976996);
        setIntField(term75803, term75803.getClass(), "categoryStartColumn", -1015274146);
        setIntField(term75803, term75803.getClass(), "categoryEndColumn", -49052672);
        term75812 = new Integer(339372704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75812;
        callMethod(klass, "setDataEndRow", argTypes, term75803, args);
    }

};


