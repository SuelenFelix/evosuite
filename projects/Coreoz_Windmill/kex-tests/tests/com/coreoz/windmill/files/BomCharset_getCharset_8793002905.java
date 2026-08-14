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

public class BomCharset_getCharset_8793002905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;

    public BomCharset_getCharset_8793002905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term548 = (byte[]) newByteArray(5);
        setField(term547, term547.getClass(), "charset", null);
        setByteElement(term548, 0, (byte) 42);
        setByteElement(term548, 1, (byte) 72);
        setByteElement(term548, 2, (byte) 111);
        setByteElement(term548, 3, (byte) 99);
        setByteElement(term548, 4, (byte) -12);
        setField(term547, term547.getClass(), "bomBytes", term548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.BomCharset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharset", argTypes, term547, args);
    }

};


