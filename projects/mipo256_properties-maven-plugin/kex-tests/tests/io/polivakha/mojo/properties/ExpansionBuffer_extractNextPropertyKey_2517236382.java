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

public class ExpansionBuffer_extractNextPropertyKey_2517236382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185;

    public ExpansionBuffer_extractNextPropertyKey_2517236382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1185 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        Object term1187 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1188 = (byte[]) newByteArray(16);
        setBooleanField(term1185, term1185.getClass(), "isFullyResolved", false);
        setField(term1187, term1187.getClass(), "value", term1188);
        setByteField(term1187, term1187.getClass(), "coder", (byte) 48);
        setIntField(term1187, term1187.getClass(), "count", 1876565163);
        setField(term1185, term1185.getClass(), "resolved", term1187);
        setField(term1185, term1185.getClass(), "unresolved", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "extractNextPropertyKey", argTypes, term1185, args);
    }

};


