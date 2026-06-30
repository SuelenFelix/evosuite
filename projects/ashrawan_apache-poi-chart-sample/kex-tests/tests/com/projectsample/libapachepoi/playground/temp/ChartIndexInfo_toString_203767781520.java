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

public class ChartIndexInfo_toString_203767781520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190;

    public ChartIndexInfo_toString_203767781520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term190, term190.getClass(), "dataStartRow", 1283079251);
        setIntField(term190, term190.getClass(), "dataEndRow", -523949691);
        setIntField(term190, term190.getClass(), "dataStartColumn", 1398204340);
        setIntField(term190, term190.getClass(), "dataEndColumn", 229204365);
        setIntField(term190, term190.getClass(), "categoryStartRow", -461771056);
        setIntField(term190, term190.getClass(), "categoryEndRow", -243422082);
        setIntField(term190, term190.getClass(), "categoryStartColumn", 1384592638);
        setIntField(term190, term190.getClass(), "categoryEndColumn", -1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term190, args);
    }

};


