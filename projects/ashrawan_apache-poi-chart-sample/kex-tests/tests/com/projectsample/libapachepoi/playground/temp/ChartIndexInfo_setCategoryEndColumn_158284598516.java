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

public class ChartIndexInfo_setCategoryEndColumn_158284598516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75869;
     Object term75878;

    public ChartIndexInfo_setCategoryEndColumn_158284598516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75869 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75869, term75869.getClass(), "dataStartRow", -1332748804);
        setIntField(term75869, term75869.getClass(), "dataEndRow", 1774507971);
        setIntField(term75869, term75869.getClass(), "dataStartColumn", -1420269858);
        setIntField(term75869, term75869.getClass(), "dataEndColumn", -2119545015);
        setIntField(term75869, term75869.getClass(), "categoryStartRow", 1272542218);
        setIntField(term75869, term75869.getClass(), "categoryEndRow", 1209799204);
        setIntField(term75869, term75869.getClass(), "categoryStartColumn", 1094107751);
        setIntField(term75869, term75869.getClass(), "categoryEndColumn", 844222656);
        term75878 = new Integer(-18216811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75878;
        callMethod(klass, "setCategoryEndColumn", argTypes, term75869, args);
    }

};


