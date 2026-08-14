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

public class ExpansionBuffer_toString_9984555205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1365;

    public ExpansionBuffer_toString_9984555205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1365 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        Object term1367 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1368 = (byte[]) newByteArray(16);
        setBooleanField(term1365, term1365.getClass(), "isFullyResolved", true);
        setField(term1367, term1367.getClass(), "value", term1368);
        setByteField(term1367, term1367.getClass(), "coder", (byte) 18);
        setIntField(term1367, term1367.getClass(), "count", -1968847291);
        setField(term1365, term1365.getClass(), "resolved", term1367);
        setField(term1365, term1365.getClass(), "unresolved", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1365, args);
    }

};


