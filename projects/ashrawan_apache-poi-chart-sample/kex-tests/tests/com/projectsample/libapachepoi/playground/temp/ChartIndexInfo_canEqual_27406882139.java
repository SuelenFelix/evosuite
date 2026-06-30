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

public class ChartIndexInfo_canEqual_27406882139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;

    public ChartIndexInfo_canEqual_27406882139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term368, term368.getClass(), "dataStartRow", 0);
        setIntField(term368, term368.getClass(), "dataEndRow", 0);
        setIntField(term368, term368.getClass(), "dataStartColumn", 0);
        setIntField(term368, term368.getClass(), "dataEndColumn", 0);
        setIntField(term368, term368.getClass(), "categoryStartRow", 0);
        setIntField(term368, term368.getClass(), "categoryEndRow", 0);
        setIntField(term368, term368.getClass(), "categoryStartColumn", 0);
        setIntField(term368, term368.getClass(), "categoryEndColumn", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term368, args);
    }

};


