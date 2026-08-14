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

public class AbstractWritePropertiesMojo_StoreProperties_1_keys_12748498136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1014;

    public AbstractWritePropertiesMojo_StoreProperties_1_keys_12748498136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1014 = newInstance(Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1"));
        setField(term1014, term1014.getClass(), "this$0", null);
        setField(term1014, term1014.getClass(), "defaults", null);
        setField(term1014, term1014.getClass(), "map", null);
        setField(term1014, term1014.getClass(), "table", null);
        setIntField(term1014, term1014.getClass(), "count", 0);
        setIntField(term1014, term1014.getClass(), "threshold", 0);
        setFloatField(term1014, term1014.getClass(), "loadFactor", 0.0F);
        setIntField(term1014, term1014.getClass(), "modCount", 0);
        setField(term1014, term1014.getClass(), "keySet", null);
        setField(term1014, term1014.getClass(), "entrySet", null);
        setField(term1014, term1014.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keys", argTypes, term1014, args);
    }

};


