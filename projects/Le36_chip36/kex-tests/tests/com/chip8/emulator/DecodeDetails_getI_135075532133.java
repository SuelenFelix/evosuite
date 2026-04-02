package com.chip8.emulator;

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
import static com.chip8.emulator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DecodeDetails_getI_135075532133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722416;

    public DecodeDetails_getI_135075532133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722416 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722416, term4722416.getClass(), "opcode", (short) 0);
        setField(term4722416, term4722416.getClass(), "x", null);
        setField(term4722416, term4722416.getClass(), "y", null);
        setField(term4722416, term4722416.getClass(), "nnn", null);
        setField(term4722416, term4722416.getClass(), "nn", null);
        setField(term4722416, term4722416.getClass(), "n", null);
        setField(term4722416, term4722416.getClass(), "iBefore", null);
        setField(term4722416, term4722416.getClass(), "i", null);
        setField(term4722416, term4722416.getClass(), "pc", null);
        setBooleanField(term4722416, term4722416.getClass(), "state", false);
        setBooleanField(term4722416, term4722416.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getI", argTypes, term4722416, args);
    }

};


