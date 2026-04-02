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

public class DecodeDetails_toString_1135590587151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722494;

    public DecodeDetails_toString_1135590587151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722494 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722494, term4722494.getClass(), "opcode", (short) 0);
        setField(term4722494, term4722494.getClass(), "x", null);
        setField(term4722494, term4722494.getClass(), "y", null);
        setField(term4722494, term4722494.getClass(), "nnn", null);
        setField(term4722494, term4722494.getClass(), "nn", null);
        setField(term4722494, term4722494.getClass(), "n", null);
        setField(term4722494, term4722494.getClass(), "iBefore", null);
        setField(term4722494, term4722494.getClass(), "i", null);
        setField(term4722494, term4722494.getClass(), "pc", null);
        setBooleanField(term4722494, term4722494.getClass(), "state", false);
        setBooleanField(term4722494, term4722494.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4722494, args);
    }

};


