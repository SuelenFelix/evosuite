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
import java.lang.Boolean;

public class DecodeDetails_setState_25274152970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4721064;
     Object term4721164;

    public DecodeDetails_setState_25274152970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4721064 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4721064, term4721064.getClass(), "opcode", (short) -20389);
        setField(term4721064, term4721064.getClass(), "x", "arrHHpXCBD");
        setField(term4721064, term4721064.getClass(), "y", "zzfzxQYlis");
        setField(term4721064, term4721064.getClass(), "nnn", "TJJQwVEzxz");
        setField(term4721064, term4721064.getClass(), "nn", "kHtEHBrsFo");
        setField(term4721064, term4721064.getClass(), "n", "EmAvkhGlPV");
        setField(term4721064, term4721064.getClass(), "iBefore", "mBrbyQVzve");
        setField(term4721064, term4721064.getClass(), "i", "FQODEbQeKa");
        setField(term4721064, term4721064.getClass(), "pc", "iLsUPvsdys");
        setBooleanField(term4721064, term4721064.getClass(), "state", false);
        setBooleanField(term4721064, term4721064.getClass(), "resolutionMode", false);
        term4721164 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4721164;
        callMethod(klass, "setState", argTypes, term4721064, args);
    }

};


