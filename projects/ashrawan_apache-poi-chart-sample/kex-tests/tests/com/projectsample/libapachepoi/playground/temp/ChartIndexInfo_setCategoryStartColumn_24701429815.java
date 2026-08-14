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

public class ChartIndexInfo_setCategoryStartColumn_24701429815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75858;
     Object term75867;

    public ChartIndexInfo_setCategoryStartColumn_24701429815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75858 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75858, term75858.getClass(), "dataStartRow", 533197381);
        setIntField(term75858, term75858.getClass(), "dataEndRow", 1048271679);
        setIntField(term75858, term75858.getClass(), "dataStartColumn", -1529797673);
        setIntField(term75858, term75858.getClass(), "dataEndColumn", -868676396);
        setIntField(term75858, term75858.getClass(), "categoryStartRow", 1922684808);
        setIntField(term75858, term75858.getClass(), "categoryEndRow", -2005784375);
        setIntField(term75858, term75858.getClass(), "categoryStartColumn", -288604325);
        setIntField(term75858, term75858.getClass(), "categoryEndColumn", -1268314569);
        term75867 = new Integer(877649659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75867;
        callMethod(klass, "setCategoryStartColumn", argTypes, term75858, args);
    }

};


