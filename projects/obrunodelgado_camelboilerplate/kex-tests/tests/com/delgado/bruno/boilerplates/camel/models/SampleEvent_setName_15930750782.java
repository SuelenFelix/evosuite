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

public class SampleEvent_setName_15930750782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public SampleEvent_setName_15930750782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term62 = new Integer(1162663216);
        term49 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent"));
        Object term64 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term65 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term67 = (int[]) newIntArray(6);
        setField(term49, term49.getClass(), "name", "sjlJAEtRrb");
        setField(term49, term49.getClass(), "quantity", term62);
        setIntField(term65, term65.getClass(), "signum", 1);
        setIntElement(term67, 0, 2364);
        setIntElement(term67, 1, -1446584625);
        setIntElement(term67, 2, 1957600567);
        setIntElement(term67, 3, -336418707);
        setIntElement(term67, 4, -1905211145);
        setIntElement(term67, 5, 86968353);
        setField(term65, term65.getClass(), "mag", term67);
        setIntField(term65, term65.getClass(), "bitCountPlusOne", 0);
        setIntField(term65, term65.getClass(), "bitLengthPlusOne", 0);
        setIntField(term65, term65.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term65, term65.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term64, term64.getClass(), "intVal", term65);
        setIntField(term64, term64.getClass(), "scale", 52);
        setIntField(term64, term64.getClass(), "precision", 0);
        setField(term64, term64.getClass(), "stringCache", null);
        setLongField(term64, term64.getClass(), "intCompact", -9223372036854775808L);
        setField(term49, term49.getClass(), "price", term64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "setName", argTypes, term49, args);
    }

};


