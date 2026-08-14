package com.voodoodyne.hattery;

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
import static com.voodoodyne.hattery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class URLConnectionTransport_1_write_915537603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8532;
     Object term8533;

    public URLConnectionTransport_1_write_915537603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8532 = newInstance(Class.forName("com.voodoodyne.hattery.URLConnectionTransport$1"));
        setField(term8532, term8532.getClass(), "real", null);
        setField(term8532, term8532.getClass(), "val$conn", null);
        setField(term8532, term8532.getClass(), "this$0", null);
        term8533 = (byte[]) newByteArray(5);
        setByteElement(term8533, 0, (byte) -10);
        setByteElement(term8533, 1, (byte) 79);
        setByteElement(term8533, 2, (byte) -119);
        setByteElement(term8533, 3, (byte) -66);
        setByteElement(term8533, 4, (byte) 83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.URLConnectionTransport$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8533;
        callMethod(klass, "write", argTypes, term8532, args);
    }

};


