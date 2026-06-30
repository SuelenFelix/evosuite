package com.innova.beantuto;

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
import static com.innova.beantuto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanController_getBeanInitialDestroy_5492851853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1286;

    public BeanController_getBeanInitialDestroy_5492851853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1286 = newInstance(Class.forName("com.innova.beantuto.BeanController"));
        Object term1287 = newInstance(Class.forName("com.innova.beantuto._01_BeanBasic"));
        Object term1288 = newInstance(Class.forName("com.innova.beantuto._02_BeanScope"));
        Object term1289 = newInstance(Class.forName("com.innova.beantuto._03_BeanIntialDestroy"));
        Object term1290 = newInstance(Class.forName("com.innova.beantuto._03_BeanIntialDestroy"));
        setField(term1286, term1286.getClass(), "beanBasic", term1287);
        setField(term1286, term1286.getClass(), "beanScope", term1288);
        setField(term1286, term1286.getClass(), "beanIntialDestroy1", term1289);
        setField(term1286, term1286.getClass(), "beanIntialDestroy2", term1290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.beantuto.BeanController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeanInitialDestroy", argTypes, term1286, args);
    }

};


