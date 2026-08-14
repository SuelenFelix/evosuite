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
import java.lang.Object;

public class FileSource_toInputStream_17797586811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;

    public FileSource_toInputStream_17797586811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456 = newInstance(Class.forName("com.coreoz.windmill.files.FileSource"));
        Object term457 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term458 = (byte[]) newByteArray(4);
        setByteElement(term458, 0, (byte) -58);
        setByteElement(term458, 1, (byte) -29);
        setByteElement(term458, 2, (byte) -54);
        setByteElement(term458, 3, (byte) -10);
        setField(term457, term457.getClass(), "buf", term458);
        setIntField(term457, term457.getClass(), "pos", -616727354);
        setField(term457, term457.getClass(), "in", null);
        setField(term456, term456.getClass(), "bufferedStream", term457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.FileSource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toInputStream", argTypes, term456, args);
    }

};


