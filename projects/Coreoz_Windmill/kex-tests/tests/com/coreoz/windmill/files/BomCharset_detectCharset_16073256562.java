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

public class BomCharset_detectCharset_16073256562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;
     Object term508;

    public BomCharset_detectCharset_16073256562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501 = (byte[]) newByteArray(6);
        setByteElement(term501, 0, (byte) 78);
        setByteElement(term501, 1, (byte) 87);
        setByteElement(term501, 2, (byte) 121);
        setByteElement(term501, 3, (byte) -99);
        setByteElement(term501, 4, (byte) -2);
        setByteElement(term501, 5, (byte) -16);
        term508 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term509 = (byte[]) newByteArray(7);
        setField(term508, term508.getClass(), "charset", null);
        setByteElement(term509, 0, (byte) -112);
        setByteElement(term509, 1, (byte) -111);
        setByteElement(term509, 2, (byte) 23);
        setByteElement(term509, 3, (byte) -15);
        setByteElement(term509, 4, (byte) 36);
        setByteElement(term509, 5, (byte) 118);
        setByteElement(term509, 6, (byte) 106);
        setField(term508, term508.getClass(), "bomBytes", term509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.BomCharset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("com.coreoz.windmill.files.BomCharset");
        Object[] args = new Object[2];
        args[0] = term501;
        args[1] = term508;
        callMethod(klass, "detectCharset", argTypes, null, args);
    }

};


