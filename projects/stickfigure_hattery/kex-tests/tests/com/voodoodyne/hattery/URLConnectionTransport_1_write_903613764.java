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
import java.lang.Integer;

public class URLConnectionTransport_1_write_903613764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8544;
     Object term8545;
     Object term8547;
     Object term8549;

    public URLConnectionTransport_1_write_903613764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8544 = newInstance(Class.forName("com.voodoodyne.hattery.URLConnectionTransport$1"));
        setField(term8544, term8544.getClass(), "real", null);
        setField(term8544, term8544.getClass(), "val$conn", null);
        setField(term8544, term8544.getClass(), "this$0", null);
        term8545 = (byte[]) newByteArray(1);
        setByteElement(term8545, 0, (byte) 74);
        term8547 = new Integer(-1955890973);
        term8549 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.URLConnectionTransport$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term8545;
        args[1] = term8547;
        args[2] = term8549;
        callMethod(klass, "write", argTypes, term8544, args);
    }

};


