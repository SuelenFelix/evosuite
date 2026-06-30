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

public class BeanDto_BeanDtoBuilder_id_19014379081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990;
     Object term1017;

    public BeanDto_BeanDtoBuilder_id_19014379081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term991 = new Long(2442117782898005296L);
        term990 = newInstance(Class.forName("com.innova.beantuto.BeanDto$BeanDtoBuilder"));
        setField(term990, term990.getClass(), "id", term991);
        setField(term990, term990.getClass(), "beanName", "VgZnGoIFwQ");
        setField(term990, term990.getClass(), "beanData", "jUbSRrkrYZ");
        term1017 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.beantuto.BeanDto$BeanDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1017;
        callMethod(klass, "id", argTypes, term990, args);
    }

};


