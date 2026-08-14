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

public class DecodeDetails_setPc_1008824410145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722466;

    public DecodeDetails_setPc_1008824410145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722466 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722466, term4722466.getClass(), "opcode", (short) 0);
        setField(term4722466, term4722466.getClass(), "x", null);
        setField(term4722466, term4722466.getClass(), "y", null);
        setField(term4722466, term4722466.getClass(), "nnn", null);
        setField(term4722466, term4722466.getClass(), "nn", null);
        setField(term4722466, term4722466.getClass(), "n", null);
        setField(term4722466, term4722466.getClass(), "iBefore", null);
        setField(term4722466, term4722466.getClass(), "i", null);
        setField(term4722466, term4722466.getClass(), "pc", null);
        setBooleanField(term4722466, term4722466.getClass(), "state", false);
        setBooleanField(term4722466, term4722466.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPc", argTypes, term4722466, args);
    }

};


