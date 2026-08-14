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

public class ChartIndexInfo_setCategoryStartRow_129718082614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term135;

    public ChartIndexInfo_setCategoryStartRow_129718082614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term126, term126.getClass(), "dataStartRow", -1347665717);
        setIntField(term126, term126.getClass(), "dataEndRow", -1888585309);
        setIntField(term126, term126.getClass(), "dataStartColumn", 683666002);
        setIntField(term126, term126.getClass(), "dataEndColumn", 1596213415);
        setIntField(term126, term126.getClass(), "categoryStartRow", -268815336);
        setIntField(term126, term126.getClass(), "categoryEndRow", -1210583429);
        setIntField(term126, term126.getClass(), "categoryStartColumn", -663691365);
        setIntField(term126, term126.getClass(), "categoryEndColumn", 339854490);
        term135 = new Integer(-615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term135;
        callMethod(klass, "setCategoryStartRow", argTypes, term126, args);
    }

};


