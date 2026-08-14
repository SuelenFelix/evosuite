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

public class SampleEvent_getPrice_5691961665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;

    public SampleEvent_getPrice_5691961665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term230 = new Integer(-616727354);
        term217 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent"));
        Object term232 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term233 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term235 = (int[]) newIntArray(6);
        setField(term217, term217.getClass(), "name", "EGtDIRbSSb");
        setField(term217, term217.getClass(), "quantity", term230);
        setIntField(term233, term233.getClass(), "signum", 1);
        setIntElement(term235, 0, 1954);
        setIntElement(term235, 1, -476668863);
        setIntElement(term235, 2, 661030673);
        setIntElement(term235, 3, 328061253);
        setIntElement(term235, 4, -431156338);
        setIntElement(term235, 5, 791621529);
        setField(term233, term233.getClass(), "mag", term235);
        setIntField(term233, term233.getClass(), "bitCountPlusOne", 0);
        setIntField(term233, term233.getClass(), "bitLengthPlusOne", 0);
        setIntField(term233, term233.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term233, term233.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term232, term232.getClass(), "intVal", term233);
        setIntField(term232, term232.getClass(), "scale", 52);
        setIntField(term232, term232.getClass(), "precision", 0);
        setField(term232, term232.getClass(), "stringCache", null);
        setLongField(term232, term232.getClass(), "intCompact", -9223372036854775808L);
        setField(term217, term217.getClass(), "price", term232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term217, args);
    }

};


