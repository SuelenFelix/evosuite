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

public class DecodeDetails_getI_13507553257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718546;

    public DecodeDetails_getI_13507553257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4718546 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4718546, term4718546.getClass(), "opcode", (short) -8095);
        setField(term4718546, term4718546.getClass(), "x", "DYzWJljbaE");
        setField(term4718546, term4718546.getClass(), "y", "idwbHVHUcz");
        setField(term4718546, term4718546.getClass(), "nnn", "sWJHIWZMuX");
        setField(term4718546, term4718546.getClass(), "nn", "PwMdJRwzDW");
        setField(term4718546, term4718546.getClass(), "n", "sMiHxgXUuN");
        setField(term4718546, term4718546.getClass(), "iBefore", "oVChCWWDag");
        setField(term4718546, term4718546.getClass(), "i", "EteTxkDxin");
        setField(term4718546, term4718546.getClass(), "pc", "mKgLwPdYbY");
        setBooleanField(term4718546, term4718546.getClass(), "state", true);
        setBooleanField(term4718546, term4718546.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getI", argTypes, term4718546, args);
    }

};


