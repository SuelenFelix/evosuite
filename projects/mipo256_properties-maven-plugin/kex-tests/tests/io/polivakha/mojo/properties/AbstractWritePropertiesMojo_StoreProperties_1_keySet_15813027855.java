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

public class AbstractWritePropertiesMojo_StoreProperties_1_keySet_15813027855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009;

    public AbstractWritePropertiesMojo_StoreProperties_1_keySet_15813027855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1009 = newInstance(Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1"));
        setField(term1009, term1009.getClass(), "this$0", null);
        setField(term1009, term1009.getClass(), "defaults", null);
        setField(term1009, term1009.getClass(), "map", null);
        setField(term1009, term1009.getClass(), "table", null);
        setIntField(term1009, term1009.getClass(), "count", 0);
        setIntField(term1009, term1009.getClass(), "threshold", 0);
        setFloatField(term1009, term1009.getClass(), "loadFactor", 0.0F);
        setIntField(term1009, term1009.getClass(), "modCount", 0);
        setField(term1009, term1009.getClass(), "keySet", null);
        setField(term1009, term1009.getClass(), "entrySet", null);
        setField(term1009, term1009.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keySet", argTypes, term1009, args);
    }

};


