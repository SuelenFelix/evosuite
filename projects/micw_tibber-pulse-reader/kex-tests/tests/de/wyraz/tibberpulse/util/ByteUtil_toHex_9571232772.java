package de.wyraz.tibberpulse.util;

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
import static de.wyraz.tibberpulse.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ByteUtil_toHex_9571232772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public ByteUtil_toHex_9571232772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = (byte[]) newByteArray(5);
        setByteElement(term3, 0, (byte) 48);
        setByteElement(term3, 1, (byte) 89);
        setByteElement(term3, 2, (byte) 75);
        setByteElement(term3, 3, (byte) 18);
        setByteElement(term3, 4, (byte) -58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.util.ByteUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "toHex", argTypes, null, args);
    }

};


