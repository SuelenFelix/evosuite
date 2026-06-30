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

public class BeanController_getBeanScope_7023965952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;

    public BeanController_getBeanScope_7023965952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1281 = newInstance(Class.forName("com.innova.beantuto.BeanController"));
        Object term1282 = newInstance(Class.forName("com.innova.beantuto._01_BeanBasic"));
        Object term1283 = newInstance(Class.forName("com.innova.beantuto._02_BeanScope"));
        Object term1284 = newInstance(Class.forName("com.innova.beantuto._03_BeanIntialDestroy"));
        Object term1285 = newInstance(Class.forName("com.innova.beantuto._03_BeanIntialDestroy"));
        setField(term1281, term1281.getClass(), "beanBasic", term1282);
        setField(term1281, term1281.getClass(), "beanScope", term1283);
        setField(term1281, term1281.getClass(), "beanIntialDestroy1", term1284);
        setField(term1281, term1281.getClass(), "beanIntialDestroy2", term1285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.beantuto.BeanController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeanScope", argTypes, term1281, args);
    }

};


