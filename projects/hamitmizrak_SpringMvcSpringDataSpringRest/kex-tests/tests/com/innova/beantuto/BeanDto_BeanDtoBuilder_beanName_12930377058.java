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

public class BeanDto_BeanDtoBuilder_beanName_12930377058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1272;

    public BeanDto_BeanDtoBuilder_beanName_12930377058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1272 = newInstance(Class.forName("com.innova.beantuto.BeanDto$BeanDtoBuilder"));
        setField(term1272, term1272.getClass(), "id", null);
        setField(term1272, term1272.getClass(), "beanName", null);
        setField(term1272, term1272.getClass(), "beanData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.beantuto.BeanDto$BeanDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "beanName", argTypes, term1272, args);
    }

};


