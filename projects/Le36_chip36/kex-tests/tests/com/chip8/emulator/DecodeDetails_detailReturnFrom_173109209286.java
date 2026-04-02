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
import java.lang.Integer;

public class DecodeDetails_detailReturnFrom_173109209286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722198;
     Object term4722202;
     Object term4722204;

    public DecodeDetails_detailReturnFrom_173109209286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722198 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722198, term4722198.getClass(), "opcode", (short) 0);
        setField(term4722198, term4722198.getClass(), "x", null);
        setField(term4722198, term4722198.getClass(), "y", null);
        setField(term4722198, term4722198.getClass(), "nnn", null);
        setField(term4722198, term4722198.getClass(), "nn", null);
        setField(term4722198, term4722198.getClass(), "n", null);
        setField(term4722198, term4722198.getClass(), "iBefore", null);
        setField(term4722198, term4722198.getClass(), "i", null);
        setField(term4722198, term4722198.getClass(), "pc", null);
        setBooleanField(term4722198, term4722198.getClass(), "state", false);
        setBooleanField(term4722198, term4722198.getClass(), "resolutionMode", false);
        term4722202 = new Integer(0);
        term4722204 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4722202;
        args[1] = term4722204;
        callMethod(klass, "detailReturnFrom", argTypes, term4722198, args);
    }

};


