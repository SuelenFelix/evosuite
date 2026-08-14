package io.polivakha.mojo.properties;

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
import static io.polivakha.mojo.properties.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AbstractWritePropertiesMojo_StoreProperties_sortedStore_16256455271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1670;

    public AbstractWritePropertiesMojo_StoreProperties_sortedStore_16256455271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1670 = newInstance(Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties"));
        setField(term1670, term1670.getClass(), "defaults", null);
        setField(term1670, term1670.getClass(), "map", null);
        setField(term1670, term1670.getClass(), "table", null);
        setIntField(term1670, term1670.getClass(), "count", 0);
        setIntField(term1670, term1670.getClass(), "threshold", 0);
        setFloatField(term1670, term1670.getClass(), "loadFactor", 0.0F);
        setIntField(term1670, term1670.getClass(), "modCount", 0);
        setField(term1670, term1670.getClass(), "keySet", null);
        setField(term1670, term1670.getClass(), "entrySet", null);
        setField(term1670, term1670.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "sortedStore", argTypes, term1670, args);
    }

};


