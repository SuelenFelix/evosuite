package com.delgado.bruno.boilerplates.camel.models;

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
import static com.delgado.bruno.boilerplates.camel.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class SampleEvent_setQuantity_9812474034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;
     Object term199;

    public SampleEvent_setQuantity_9812474034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term180 = new Integer(391863371);
        term167 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent"));
        Object term182 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term183 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term185 = (int[]) newIntArray(6);
        setField(term167, term167.getClass(), "name", "jJCZpVmanW");
        setField(term167, term167.getClass(), "quantity", term180);
        setIntField(term183, term183.getClass(), "signum", 1);
        setIntElement(term185, 0, 3726);
        setIntElement(term185, 1, 1561510548);
        setIntElement(term185, 2, 756973629);
        setIntElement(term185, 3, -1169068666);
        setIntElement(term185, 4, -1772498162);
        setIntElement(term185, 5, -1207241473);
        setField(term183, term183.getClass(), "mag", term185);
        setIntField(term183, term183.getClass(), "bitCountPlusOne", 0);
        setIntField(term183, term183.getClass(), "bitLengthPlusOne", 0);
        setIntField(term183, term183.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term183, term183.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term182, term182.getClass(), "intVal", term183);
        setIntField(term182, term182.getClass(), "scale", 52);
        setIntField(term182, term182.getClass(), "precision", 0);
        setField(term182, term182.getClass(), "stringCache", null);
        setLongField(term182, term182.getClass(), "intCompact", -9223372036854775808L);
        setField(term167, term167.getClass(), "price", term182);
        term199 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term199;
        callMethod(klass, "setQuantity", argTypes, term167, args);
    }

};


