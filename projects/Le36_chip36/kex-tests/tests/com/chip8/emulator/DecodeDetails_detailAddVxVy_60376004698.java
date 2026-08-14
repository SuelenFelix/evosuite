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
import java.lang.Byte;

public class DecodeDetails_detailAddVxVy_60376004698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722262;
     Object term4722266;
     Object term4722268;

    public DecodeDetails_detailAddVxVy_60376004698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722262 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722262, term4722262.getClass(), "opcode", (short) 0);
        setField(term4722262, term4722262.getClass(), "x", null);
        setField(term4722262, term4722262.getClass(), "y", null);
        setField(term4722262, term4722262.getClass(), "nnn", null);
        setField(term4722262, term4722262.getClass(), "nn", null);
        setField(term4722262, term4722262.getClass(), "n", null);
        setField(term4722262, term4722262.getClass(), "iBefore", null);
        setField(term4722262, term4722262.getClass(), "i", null);
        setField(term4722262, term4722262.getClass(), "pc", null);
        setBooleanField(term4722262, term4722262.getClass(), "state", false);
        setBooleanField(term4722262, term4722262.getClass(), "resolutionMode", false);
        term4722266 = new Byte((byte) 0);
        term4722268 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term4722266;
        args[1] = term4722268;
        callMethod(klass, "detailAddVxVy", argTypes, term4722262, args);
    }

};


