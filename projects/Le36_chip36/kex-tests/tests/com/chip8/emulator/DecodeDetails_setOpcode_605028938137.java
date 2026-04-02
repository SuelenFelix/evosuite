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
import java.lang.Short;

public class DecodeDetails_setOpcode_605028938137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722432;
     Object term4722436;

    public DecodeDetails_setOpcode_605028938137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722432 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722432, term4722432.getClass(), "opcode", (short) 0);
        setField(term4722432, term4722432.getClass(), "x", null);
        setField(term4722432, term4722432.getClass(), "y", null);
        setField(term4722432, term4722432.getClass(), "nnn", null);
        setField(term4722432, term4722432.getClass(), "nn", null);
        setField(term4722432, term4722432.getClass(), "n", null);
        setField(term4722432, term4722432.getClass(), "iBefore", null);
        setField(term4722432, term4722432.getClass(), "i", null);
        setField(term4722432, term4722432.getClass(), "pc", null);
        setBooleanField(term4722432, term4722432.getClass(), "state", false);
        setBooleanField(term4722432, term4722432.getClass(), "resolutionMode", false);
        term4722436 = new Short((short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term4722436;
        callMethod(klass, "setOpcode", argTypes, term4722432, args);
    }

};


