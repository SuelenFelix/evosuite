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

public class ChartIndexInfo_setDataStartColumn_55439775411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75814;
     Object term75823;

    public ChartIndexInfo_setDataStartColumn_55439775411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75814 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75814, term75814.getClass(), "dataStartRow", -851097944);
        setIntField(term75814, term75814.getClass(), "dataEndRow", 803925431);
        setIntField(term75814, term75814.getClass(), "dataStartColumn", 76929641);
        setIntField(term75814, term75814.getClass(), "dataEndColumn", -2003192918);
        setIntField(term75814, term75814.getClass(), "categoryStartRow", -1362856620);
        setIntField(term75814, term75814.getClass(), "categoryEndRow", -1835839814);
        setIntField(term75814, term75814.getClass(), "categoryStartColumn", -1404350380);
        setIntField(term75814, term75814.getClass(), "categoryEndColumn", -2013924238);
        term75823 = new Integer(579006268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75823;
        callMethod(klass, "setDataStartColumn", argTypes, term75814, args);
    }

};


