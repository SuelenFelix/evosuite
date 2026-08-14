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

public class SampleEvent_getName_9820156501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SampleEvent_getName_9820156501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14 = new Integer(568599855);
        term1 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent"));
        Object term16 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term17 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term19 = (int[]) newIntArray(6);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "quantity", term14);
        setIntField(term17, term17.getClass(), "signum", 1);
        setIntElement(term19, 0, 9058);
        setIntElement(term19, 1, 1365043541);
        setIntElement(term19, 2, 1239861896);
        setIntElement(term19, 3, -1338148297);
        setIntElement(term19, 4, -418263970);
        setIntElement(term19, 5, -265097411);
        setField(term17, term17.getClass(), "mag", term19);
        setIntField(term17, term17.getClass(), "bitCountPlusOne", 0);
        setIntField(term17, term17.getClass(), "bitLengthPlusOne", 0);
        setIntField(term17, term17.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term17, term17.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term16, term16.getClass(), "intVal", term17);
        setIntField(term16, term16.getClass(), "scale", 53);
        setIntField(term16, term16.getClass(), "precision", 0);
        setField(term16, term16.getClass(), "stringCache", null);
        setLongField(term16, term16.getClass(), "intCompact", -9223372036854775808L);
        setField(term1, term1.getClass(), "price", term16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1, args);
    }

};


