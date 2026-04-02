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

public class BeanController_getBeanBasic_15540387711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276;

    public BeanController_getBeanBasic_15540387711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1276 = newInstance(Class.forName("com.innova.beantuto.BeanController"));
        Object term1277 = newInstance(Class.forName("com.innova.beantuto._01_BeanBasic"));
        Object term1278 = newInstance(Class.forName("com.innova.beantuto._02_BeanScope"));
        Object term1279 = newInstance(Class.forName("com.innova.beantuto._03_BeanIntialDestroy"));
        Object term1280 = newInstance(Class.forName("com.innova.beantuto._03_BeanIntialDestroy"));
        setField(term1276, term1276.getClass(), "beanBasic", term1277);
        setField(term1276, term1276.getClass(), "beanScope", term1278);
        setField(term1276, term1276.getClass(), "beanIntialDestroy1", term1279);
        setField(term1276, term1276.getClass(), "beanIntialDestroy2", term1280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.beantuto.BeanController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeanBasic", argTypes, term1276, args);
    }

};


