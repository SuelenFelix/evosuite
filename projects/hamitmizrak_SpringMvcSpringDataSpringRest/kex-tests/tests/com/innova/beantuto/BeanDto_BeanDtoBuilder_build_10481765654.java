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
import java.lang.Long;

public class BeanDto_BeanDtoBuilder_build_10481765654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1177;

    public BeanDto_BeanDtoBuilder_build_10481765654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1178 = new Long(5270370404989704783L);
        term1177 = newInstance(Class.forName("com.innova.beantuto.BeanDto$BeanDtoBuilder"));
        setField(term1177, term1177.getClass(), "id", term1178);
        setField(term1177, term1177.getClass(), "beanName", "jSpAteRute");
        setField(term1177, term1177.getClass(), "beanData", "swZVeJAxjt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.beantuto.BeanDto$BeanDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1177, args);
    }

};


