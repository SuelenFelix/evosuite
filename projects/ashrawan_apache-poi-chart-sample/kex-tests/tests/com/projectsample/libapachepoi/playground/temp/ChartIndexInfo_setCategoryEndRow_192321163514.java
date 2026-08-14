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

public class ChartIndexInfo_setCategoryEndRow_192321163514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75847;
     Object term75856;

    public ChartIndexInfo_setCategoryEndRow_192321163514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75847 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75847, term75847.getClass(), "dataStartRow", -1972436591);
        setIntField(term75847, term75847.getClass(), "dataEndRow", 68922753);
        setIntField(term75847, term75847.getClass(), "dataStartColumn", -220791533);
        setIntField(term75847, term75847.getClass(), "dataEndColumn", 1741500243);
        setIntField(term75847, term75847.getClass(), "categoryStartRow", -2070466617);
        setIntField(term75847, term75847.getClass(), "categoryEndRow", -1127721881);
        setIntField(term75847, term75847.getClass(), "categoryStartColumn", 1074848808);
        setIntField(term75847, term75847.getClass(), "categoryEndColumn", -146054762);
        term75856 = new Integer(798043553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75856;
        callMethod(klass, "setCategoryEndRow", argTypes, term75847, args);
    }

};


