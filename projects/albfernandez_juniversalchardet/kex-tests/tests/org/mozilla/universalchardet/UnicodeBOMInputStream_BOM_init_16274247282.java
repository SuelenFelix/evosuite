package org.mozilla.universalchardet;

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
import static org.mozilla.universalchardet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnicodeBOMInputStream_BOM_init_16274247282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406264;

    public UnicodeBOMInputStream_BOM_init_16274247282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406264 = (byte[]) newByteArray(6);
        setByteElement(term406264, 0, (byte) -28);
        setByteElement(term406264, 1, (byte) -18);
        setByteElement(term406264, 2, (byte) -61);
        setByteElement(term406264, 3, (byte) 70);
        setByteElement(term406264, 4, (byte) 89);
        setByteElement(term406264, 5, (byte) -99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term406264;
        args[1] = "JDswTTCZHV";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


