package icu.samnyan.aqua.sega.util;

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
import static icu.samnyan.aqua.sega.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Compression_decompress_13626973611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;

    public Compression_decompress_13626973611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = (byte[]) newByteArray(5);
        setByteElement(term95, 0, (byte) 47);
        setByteElement(term95, 1, (byte) 48);
        setByteElement(term95, 2, (byte) 89);
        setByteElement(term95, 3, (byte) 75);
        setByteElement(term95, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.Compression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term95;
        callMethod(klass, "decompress", argTypes, null, args);
    }

};


