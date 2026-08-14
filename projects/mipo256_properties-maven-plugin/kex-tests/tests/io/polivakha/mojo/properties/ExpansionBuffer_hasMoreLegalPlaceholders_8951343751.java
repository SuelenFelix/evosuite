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
import java.lang.Object;

public class ExpansionBuffer_hasMoreLegalPlaceholders_8951343751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125;

    public ExpansionBuffer_hasMoreLegalPlaceholders_8951343751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1125 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        Object term1127 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1128 = (byte[]) newByteArray(16);
        setBooleanField(term1125, term1125.getClass(), "isFullyResolved", false);
        setField(term1127, term1127.getClass(), "value", term1128);
        setByteField(term1127, term1127.getClass(), "coder", (byte) 47);
        setIntField(term1127, term1127.getClass(), "count", -157887805);
        setField(term1125, term1125.getClass(), "resolved", term1127);
        setField(term1125, term1125.getClass(), "unresolved", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMoreLegalPlaceholders", argTypes, term1125, args);
    }

};


