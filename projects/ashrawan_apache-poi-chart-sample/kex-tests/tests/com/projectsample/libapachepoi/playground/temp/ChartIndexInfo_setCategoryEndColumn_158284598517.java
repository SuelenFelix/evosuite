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

public class ChartIndexInfo_setCategoryEndColumn_158284598517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term168;

    public ChartIndexInfo_setCategoryEndColumn_158284598517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term159, term159.getClass(), "dataStartRow", 1107176718);
        setIntField(term159, term159.getClass(), "dataEndRow", 480137250);
        setIntField(term159, term159.getClass(), "dataStartColumn", -341152642);
        setIntField(term159, term159.getClass(), "dataEndColumn", -2015854073);
        setIntField(term159, term159.getClass(), "categoryStartRow", 538259104);
        setIntField(term159, term159.getClass(), "categoryEndRow", 96566506);
        setIntField(term159, term159.getClass(), "categoryStartColumn", -343325701);
        setIntField(term159, term159.getClass(), "categoryEndColumn", 107945604);
        term168 = new Integer(-1963464809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term168;
        callMethod(klass, "setCategoryEndColumn", argTypes, term159, args);
    }

};


