package com.coreoz.windmill.files;

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
import static com.coreoz.windmill.files.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BomCharset_getBomBytes_14090576486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;

    public BomCharset_getBomBytes_14090576486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term560 = (byte[]) newByteArray(5);
        setField(term559, term559.getClass(), "charset", null);
        setByteElement(term560, 0, (byte) -61);
        setByteElement(term560, 1, (byte) -85);
        setByteElement(term560, 2, (byte) -22);
        setByteElement(term560, 3, (byte) 93);
        setByteElement(term560, 4, (byte) 69);
        setField(term559, term559.getClass(), "bomBytes", term560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.BomCharset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBomBytes", argTypes, term559, args);
    }

};


