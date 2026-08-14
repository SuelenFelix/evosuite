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

public class FileSource_of_19313503204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public FileSource_of_19313503204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476 = (byte[]) newByteArray(6);
        setByteElement(term476, 0, (byte) -119);
        setByteElement(term476, 1, (byte) -66);
        setByteElement(term476, 2, (byte) 83);
        setByteElement(term476, 3, (byte) 74);
        setByteElement(term476, 4, (byte) -71);
        setByteElement(term476, 5, (byte) 49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.FileSource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term476;
        callMethod(klass, "of", argTypes, null, args);
    }

};


