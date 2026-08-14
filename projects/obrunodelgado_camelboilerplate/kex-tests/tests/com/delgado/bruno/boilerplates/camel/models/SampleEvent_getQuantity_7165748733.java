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

public class SampleEvent_getQuantity_7165748733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public SampleEvent_getQuantity_7165748733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term132 = new Integer(1484323161);
        term119 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent"));
        Object term134 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term135 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term137 = (int[]) newIntArray(6);
        setField(term119, term119.getClass(), "name", "xxtlPwDYFs");
        setField(term119, term119.getClass(), "quantity", term132);
        setIntField(term135, term135.getClass(), "signum", 1);
        setIntElement(term137, 0, 3779);
        setIntElement(term137, 1, 1825499203);
        setIntElement(term137, 2, 189827582);
        setIntElement(term137, 3, 731025545);
        setIntElement(term137, 4, -475097163);
        setIntElement(term137, 5, 890127363);
        setField(term135, term135.getClass(), "mag", term137);
        setIntField(term135, term135.getClass(), "bitCountPlusOne", 0);
        setIntField(term135, term135.getClass(), "bitLengthPlusOne", 0);
        setIntField(term135, term135.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term135, term135.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term134, term134.getClass(), "intVal", term135);
        setIntField(term134, term134.getClass(), "scale", 52);
        setIntField(term134, term134.getClass(), "precision", 0);
        setField(term134, term134.getClass(), "stringCache", null);
        setLongField(term134, term134.getClass(), "intCompact", -9223372036854775808L);
        setField(term119, term119.getClass(), "price", term134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term119, args);
    }

};


