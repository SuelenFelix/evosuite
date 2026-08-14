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

public class ExpansionBuffer_getFullyResolved_3302094404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1305;

    public ExpansionBuffer_getFullyResolved_3302094404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1305 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        Object term1307 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1308 = (byte[]) newByteArray(16);
        setBooleanField(term1305, term1305.getClass(), "isFullyResolved", false);
        setField(term1307, term1307.getClass(), "value", term1308);
        setByteField(term1307, term1307.getClass(), "coder", (byte) 75);
        setIntField(term1307, term1307.getClass(), "count", -1016503459);
        setField(term1305, term1305.getClass(), "resolved", term1307);
        setField(term1305, term1305.getClass(), "unresolved", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullyResolved", argTypes, term1305, args);
    }

};


