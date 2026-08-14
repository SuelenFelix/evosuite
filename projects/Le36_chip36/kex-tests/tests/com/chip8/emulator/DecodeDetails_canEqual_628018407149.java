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

public class DecodeDetails_canEqual_628018407149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722486;

    public DecodeDetails_canEqual_628018407149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722486 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722486, term4722486.getClass(), "opcode", (short) 0);
        setField(term4722486, term4722486.getClass(), "x", null);
        setField(term4722486, term4722486.getClass(), "y", null);
        setField(term4722486, term4722486.getClass(), "nnn", null);
        setField(term4722486, term4722486.getClass(), "nn", null);
        setField(term4722486, term4722486.getClass(), "n", null);
        setField(term4722486, term4722486.getClass(), "iBefore", null);
        setField(term4722486, term4722486.getClass(), "i", null);
        setField(term4722486, term4722486.getClass(), "pc", null);
        setBooleanField(term4722486, term4722486.getClass(), "state", false);
        setBooleanField(term4722486, term4722486.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term4722486, args);
    }

};


