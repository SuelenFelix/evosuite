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

public class ChartIndexInfo_toString_203767781541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386;

    public ChartIndexInfo_toString_203767781541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term386, term386.getClass(), "dataStartRow", 0);
        setIntField(term386, term386.getClass(), "dataEndRow", 0);
        setIntField(term386, term386.getClass(), "dataStartColumn", 0);
        setIntField(term386, term386.getClass(), "dataEndColumn", 0);
        setIntField(term386, term386.getClass(), "categoryStartRow", 0);
        setIntField(term386, term386.getClass(), "categoryEndRow", 0);
        setIntField(term386, term386.getClass(), "categoryStartColumn", 0);
        setIntField(term386, term386.getClass(), "categoryEndColumn", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term386, args);
    }

};


