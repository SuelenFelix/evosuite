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

public class ChartIndexInfo_setCategoryStartColumn_24701429816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term157;

    public ChartIndexInfo_setCategoryStartColumn_24701429816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term148, term148.getClass(), "dataStartRow", 906181092);
        setIntField(term148, term148.getClass(), "dataEndRow", 1045657203);
        setIntField(term148, term148.getClass(), "dataStartColumn", 1386130016);
        setIntField(term148, term148.getClass(), "dataEndColumn", 1072005683);
        setIntField(term148, term148.getClass(), "categoryStartRow", 1861318859);
        setIntField(term148, term148.getClass(), "categoryEndRow", 1474524152);
        setIntField(term148, term148.getClass(), "categoryStartColumn", 568954359);
        setIntField(term148, term148.getClass(), "categoryEndColumn", 53410913);
        term157 = new Integer(-375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157;
        callMethod(klass, "setCategoryStartColumn", argTypes, term148, args);
    }

};


