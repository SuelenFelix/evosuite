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

public class DecodeDetails_detailBinary_175308439597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722254;
     Object term4722258;
     Object term4722260;

    public DecodeDetails_detailBinary_175308439597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722254 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722254, term4722254.getClass(), "opcode", (short) 0);
        setField(term4722254, term4722254.getClass(), "x", null);
        setField(term4722254, term4722254.getClass(), "y", null);
        setField(term4722254, term4722254.getClass(), "nnn", null);
        setField(term4722254, term4722254.getClass(), "nn", null);
        setField(term4722254, term4722254.getClass(), "n", null);
        setField(term4722254, term4722254.getClass(), "iBefore", null);
        setField(term4722254, term4722254.getClass(), "i", null);
        setField(term4722254, term4722254.getClass(), "pc", null);
        setBooleanField(term4722254, term4722254.getClass(), "state", false);
        setBooleanField(term4722254, term4722254.getClass(), "resolutionMode", false);
        term4722258 = new Byte((byte) 0);
        term4722260 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term4722258;
        args[1] = term4722260;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "detailBinary", argTypes, term4722254, args);
    }

};


