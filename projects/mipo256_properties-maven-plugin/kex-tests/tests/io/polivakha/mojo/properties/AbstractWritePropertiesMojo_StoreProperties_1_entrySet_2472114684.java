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

public class AbstractWritePropertiesMojo_StoreProperties_1_entrySet_2472114684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1004;

    public AbstractWritePropertiesMojo_StoreProperties_1_entrySet_2472114684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1004 = newInstance(Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1"));
        setField(term1004, term1004.getClass(), "this$0", null);
        setField(term1004, term1004.getClass(), "defaults", null);
        setField(term1004, term1004.getClass(), "map", null);
        setField(term1004, term1004.getClass(), "table", null);
        setIntField(term1004, term1004.getClass(), "count", 0);
        setIntField(term1004, term1004.getClass(), "threshold", 0);
        setFloatField(term1004, term1004.getClass(), "loadFactor", 0.0F);
        setIntField(term1004, term1004.getClass(), "modCount", 0);
        setField(term1004, term1004.getClass(), "keySet", null);
        setField(term1004, term1004.getClass(), "entrySet", null);
        setField(term1004, term1004.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "entrySet", argTypes, term1004, args);
    }

};


